package deep.bpm.controller

import deep.bpm.dto.ActionCreateDTO
import deep.bpm.dto.ApplicationCreateDTO
import deep.bpm.dto.ChangeApplicationDTO
import deep.bpm.dto.UserApplicationsDTO
import deep.bpm.service.BPMService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/bpm")
class BPMController(
    val BPMService: BPMService
) {
    @PostMapping(path=["/create-action"])
    fun actionCreate(@RequestBody actionCreateDTO: ActionCreateDTO) = BPMService.actionCreate(actionCreateDTO)

    @PostMapping(path=["/create-application"])
    fun applicationCreate(@RequestBody applicationCreateDTO: ApplicationCreateDTO) = BPMService.applicationCreate(applicationCreateDTO)

    @PostMapping(path=["/change-status-and-counter"])
    fun changeStatusAndCounter(@RequestBody changeApplicationDTO: ChangeApplicationDTO) = BPMService.changeStatusAndCounter(changeApplicationDTO)

    @GetMapping(path=["/get-all-actions/{token}"])
    fun getAllActions(@PathVariable token: String) = BPMService.getAllActions(token)

    @PostMapping(path=["/get-all-user-applications"])
    fun getAllUserApplications(@RequestBody userApplicationsDTO: UserApplicationsDTO) = BPMService.getAllUserApplications(userApplicationsDTO.userId, userApplicationsDTO.token)
}
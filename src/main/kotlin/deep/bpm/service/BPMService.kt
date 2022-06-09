package deep.bpm.service

import deep.bpm.dto.ActionCreateDTO
import deep.bpm.dto.ApplicationCreateDTO
import deep.bpm.dto.ChangeApplicationDTO
import deep.bpm.model.Action
import deep.bpm.model.Application
import deep.bpm.repository.ActionRepository
import deep.bpm.repository.ApplicationRepository
import org.bson.types.ObjectId
import org.springframework.stereotype.Service

interface BPMService {
    fun actionCreate(actionCreateDTO: ActionCreateDTO)
    fun applicationCreate(applicationCreateDTO: ApplicationCreateDTO)
    fun getAllActions(token: String) : List<Action>
    fun getAllUserApplications(userId: String, token: String) : List<Application>
    fun changeStatusAndCounter(changeApplicationDTO: ChangeApplicationDTO)
}

@Service
class ActionServiceImpl(
    private val actionRepository: ActionRepository,
    private val applicationRepository: ApplicationRepository
) : BPMService {
    override fun actionCreate(actionCreateDTO: ActionCreateDTO) {
        actionRepository.save(Action(
            actionCreateDTO.name,
            actionCreateDTO.description,
            actionCreateDTO.steps,
            actionCreateDTO.status,
            actionCreateDTO.companyToken
        ))
    }

    override fun applicationCreate(applicationCreateDTO: ApplicationCreateDTO) {
        applicationRepository.save(Application(
            applicationCreateDTO.userApplicantId,
            applicationCreateDTO.action,
            applicationCreateDTO.stepCounter,
            applicationCreateDTO.status,
            applicationCreateDTO.companyToken
        ))
    }

    override fun getAllActions(token: String) : List<Action> = actionRepository.getAllByCompanyToken(token)

    override fun getAllUserApplications(userId: String, token: String) : List<Application> = applicationRepository.getAllByUserApplicantIdAndCompanyToken(userId, token)

    override fun changeStatusAndCounter(changeApplicationDTO: ChangeApplicationDTO) {
        applicationRepository.save(changeApplicationDTO.changedApplication)
    }

}
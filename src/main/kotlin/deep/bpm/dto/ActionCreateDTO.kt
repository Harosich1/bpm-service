package deep.bpm.dto

import deep.bpm.model.Step

class ActionCreateDTO(
    var name: String,
    var description: String,
    var steps: List<Step>,
    var status: String,
    var companyToken: String
)
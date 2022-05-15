package deep.bpm.dto

import deep.bpm.model.Action
import org.bson.types.ObjectId

class ApplicationCreateDTO (
    var userApplicantId: ObjectId,
    var action: Action,
    var stepCounter: Int,
    var status: String,
    var companyToken: String
)
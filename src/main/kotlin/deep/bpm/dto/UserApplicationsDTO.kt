package deep.bpm.dto

import org.bson.types.ObjectId

class UserApplicationsDTO (
    var userId: ObjectId,
    var token: String
)
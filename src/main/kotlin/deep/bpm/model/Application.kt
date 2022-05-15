package deep.bpm.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "APPLICATION")
class Application (
    var userApplicantId: ObjectId,
    var action: Action,
    var stepCounter: Int,
    var status: String,
    var companyToken: String
) {
    @Id
    var id: ObjectId = ObjectId.get()
}
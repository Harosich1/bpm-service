package deep.bpm.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "ACTION")
class Action(
    var name: String,
    var description: String,
    var steps: List<Step>,
    var status: String,
    var companyToken: String
) {
    @Id
    var id: String = ObjectId.get().toString()
}
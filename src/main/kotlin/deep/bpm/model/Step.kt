package deep.bpm.model

import org.bson.types.ObjectId
import java.util.Date

class Step(
    var decimalFields: Map<String, String>,
    var stringFields: Map<String, String>,
    var descriptionField: String,
    var dateField: Date,
    var dropDownChoiceField: String,
    var userContractor: String,
    var status: String
)
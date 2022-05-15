package deep.bpm.model

import org.bson.types.ObjectId
import java.math.BigDecimal
import java.util.Date

class Step(
    var decimalFields: Map<String, BigDecimal>,
    var stringFields: Map<String, String>,
    var descriptionField: String,
    var dateField: Date,
    var dropDownChoiceField: String,
    var userContractor: ObjectId,
    var status: String
)
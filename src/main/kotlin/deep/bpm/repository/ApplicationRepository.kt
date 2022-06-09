package deep.bpm.repository

import deep.bpm.model.Application
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ApplicationRepository : MongoRepository<Application, Int> {
    fun getAllByUserApplicantIdAndCompanyToken(userApplicantId: String, companyToken: String) : List<Application>
}
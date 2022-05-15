package deep.bpm.repository

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import deep.bpm.model.Action

@Repository
interface ActionRepository : MongoRepository<Action, Int> {
    fun getAllByCompanyToken(token: String) : List<Action>
}
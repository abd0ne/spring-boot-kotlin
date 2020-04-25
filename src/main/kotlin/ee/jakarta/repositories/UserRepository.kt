package ee.jakarta.repositories

import ee.jakarta.entities.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource
interface UserRepository : JpaRepository<User, Long> {
}
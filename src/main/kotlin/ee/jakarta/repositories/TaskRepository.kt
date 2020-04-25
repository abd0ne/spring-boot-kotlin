package ee.jakarta.repositories

import ee.jakarta.entities.Task
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource
interface TaskRepository : JpaRepository<Task, Long> {
}
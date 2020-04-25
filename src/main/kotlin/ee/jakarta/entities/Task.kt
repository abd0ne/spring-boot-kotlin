package ee.jakarta.entities

import javax.persistence.*

@Entity
@Table(name = "tasks")
data class Task(
        @Column(name = "task_name") var taskName: String,
        @Id @GeneratedValue var id: Long? = null,
        @JoinColumn(name = "fk_user") @ManyToOne var owner: User
)
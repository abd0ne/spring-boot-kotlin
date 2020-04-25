package ee.jakarta.entities

import javax.persistence.*

@Entity
@Table(name = "users")
data class User(
        @Column(name = "first_name") var firstname: String,
        @Column(name = "last_name") var lastname: String,
        @Column(name = "e_mail") var email: String,
        @Id @GeneratedValue var id: Long? = null)
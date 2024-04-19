import java.time.Instant

class UserService {

    private val users = mutableListOf(User(1, "Alice", "mail@test.de", Instant.now()))

    fun listUsers() = users.toList()

    fun addUser(user: User) {
        users.add(user)
    }

    fun removeUserById(id: Int) {
        users.removeIf { user -> user.id == id }
    }

    fun userExists(id: Int): Boolean{
        return users.any { user -> user.id == id }
    }
}

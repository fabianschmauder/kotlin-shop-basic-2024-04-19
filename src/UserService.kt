import java.time.Instant

class UserService {

    private val users = mutableListOf(
        User(1, "Alice", "mail@test.de", Instant.now()),
        User(2, "Peter", "mailpter@test.de", Instant.now()),
        User(3, "albert", "albert@test.de", Instant.now())
    )

    fun listUsers(search: String = ""): List<User> {
        if (search.isEmpty())
            return users.toList()

        return users.filter { user ->
            user.name.lowercase().startsWith(search.lowercase())
        }
    }

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

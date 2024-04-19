import java.time.Instant


fun main() {
    val shop = ShopService()

    val userService = UserService()

    //
    userService.listUsers() // return all Users
    userService.listUsers("Ali") // return all Users startting with Ali
    userService.listUsers("ali") // return all Users startting with ali Ali

    println("existing Product: " + shop.buyProduct("P1", 1))
    println("not existing Product: " + shop.buyProduct("P3", 1))
    println("not existing User: " + shop.buyProduct("P3", 2))
}

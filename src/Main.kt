import java.time.Instant


fun main() {
    val shop = ShopService()

    val userService = UserService()

    //
    println("result: "+userService.listUsers()) // return all Users
    println("result: "+userService.listUsers("Al") )// return all Users startting with Al
    println("result: "+userService.listUsers("al")) // return all Users startting with ali Ali

    println("existing Product: " + shop.buyProduct("P1", 1))
    println("not existing Product: " + shop.buyProduct("P3", 1))
    println("not existing User: " + shop.buyProduct("P3", 2))
}

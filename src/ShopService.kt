class ShopService(private val userService: UserService = UserService()) {


    private val products = mutableListOf(Product("P1", 2.0), Product("P2", 2.0))


    fun listProducts(): List<Product>{
        return products.toList()
    }

    fun addProduct(product: Product){
        products += product
    }

    fun buyProduct(productName: String, userId: Int): Boolean{
        return userService.userExists(userId) &&
                products.any { product -> product.name == productName}
    }
}

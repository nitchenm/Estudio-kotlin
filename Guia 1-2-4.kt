//Guia 1.2.3

fun main() {
	
    val product1 = mapOf("Nombre" to "Audifonos","Precio" to 10000.0, "Categoria" to "Tecnologia")
    val product2 = mapOf("Nombre" to "Procesador i5-9400f", "Precio" to 90000.0, "Categoria" to "Tecnologia")
    val product3 = mapOf("Nombre" to "Ram stick 8 gb" ,"Precio" to 30000.0,"Categoria" to "Tecnologia")
    val product4 = mapOf("Nombre" to "Tarjega grafica RTX4060" ,"Precio" to 350000.0,"Categoria" to "Tecnologia")
    val product5 = mapOf("Nombre" to "Joystick generico pro 8" ,"Precio" to 450000.0,"Categoria" to "Tecnologia")
    val product6 = mapOf("Nombre" to "Escritorio gamer ProMaxUltraRaro XX" ,"Precio" to 1200000.0,"Categoria" to "Tecnologia")

    val listOfProducts = listOf(product1,product2,product3,product4,product5,product5,product6)
    
    fun searchProduct(nombre: String, listado: List<Map<String,Any>> ){
        for(product in listado){
            if(product["Nombre"] == nombre){
                println("La informacion del producto es: $product")
                break
            }else{
                println("No se ha encontrado el producto con el siguiente nombre: $nombre")
                break
            }
        }
    }
    
    searchProduct("Audifonos", listOfProducts)
    
    fun getAverage(listado: List<Map<String,Any>>){

        if(listOfProducts.isNullOrEmpty()){
            println("El listado es nulo o esta vacio.")
            return
        }

        var total: Double = 0.0
        var quantity: Int = 0
        for(product in listado){
            val price = product["Precio"] as? Double ?: 0.0
            total += price
            quantity++
        }

        val average = total/quantity
        println("El precio promedio de los productos es: $average")
    }
    
    getAverage(listOfProducts)
    
    val categoryFilter: (String, List<Map<String,Any>>) -> List<Map<String,Any>> = {category, list -> list.filter{it["Categoria"] == category} }
    
    print(categoryFilter("Tecnologia", listOfProducts))
    
}

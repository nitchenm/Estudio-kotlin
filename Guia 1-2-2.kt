//Guia 1.2.2

fun main() {
	//Ejercicios Variables y operadores aritmeticos 
    var firstNumber: Int = 2;
    var secondNumber: Double = 2.3;

    val add = firstNumber + secondNumber
    val subtract = secondNumber - firstNumber
    val divide = secondNumber / firstNumber
    val multiply = firstNumber * secondNumber

    println("La suma de $firstNumber y $secondNumber es : $add")
    println("La resta de $secondNumber y $firstNumber es : $subtract")
    println("La division de $secondNumber y $firstNumber es : $divide")
    println("La multiplicacion de $secondNumber y $firstNumber es : $multiply")

	//Seguridad ante nulos
    
    
    var nullable: String? = "Puede ser nulo"
    
    println("La longitud del string es: ${nullable?.length}")
    
    nullable =  null

    println("La longitud del string es: ${nullable?.length}")
    
    //En java se puede verificar nulo de la siguiente manera: 
    // if(nullable !=null){
    //    System.out.println(nullable);
    // }else{
    //    System.out.println("Esto es nulo")
    // }
    
    //Logica condicional con when : 
    var numero: Int = 2
    
    when (numero){
        1 -> println("Lunes")
        2 -> println("Martes")
        3 -> println("Miercoles")
        4 -> println("Jueves")
        5 -> println("Viernes")
        6 -> println("Sabado")
        7 -> println("Domingo")
        else -> println("Ingrese un numero del 1 al 7 para saber que dia es.")
    }
    
}

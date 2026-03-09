package ejercicios

fun main(){
//Desarrollar un programa que muestre la tabla de multiplicar del 5 (del 5
//al 50)
    val numero = 5
    println("Tabla de multiplicar del $numero:")
    for (i in 5..50) {
        val resultado = numero * i
        println("$numero x $i = $resultado")
    }

}
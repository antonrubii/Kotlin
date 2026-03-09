package ejercicios

fun main(){
// Realizar un programa que lea por teclado cuatro valores numéricos enteros
//e informar su suma y promedio.


    println("Ingrese el primer valor ")
    val valor1 = readLine()!!.toInt()
    println("Ingrese el segundo valor ")
    val valor2 = readLine()!!.toInt()
    println("Ingrese el tercer valor ")
    val valor3 = readLine()!!.toInt()
    println("Ingrese el cuarto valor ")
    val valor4 = readLine()!!.toInt()

    val suma = valor1 + valor2 + valor3 + valor4

    val promedio = suma / 4

    println("La suma de los valores es: $suma")
    println("El promedio de los valores es: $promedio")
}
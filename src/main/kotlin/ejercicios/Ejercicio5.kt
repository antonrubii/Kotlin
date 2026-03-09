package ejercicios

fun main(){
//Confeccionar un programa que permita cargar un número entero positivo de
//hasta tres cifras y muestre un mensaje indicando si tiene 1, 2, o 3
//cifras. Mostrar un mensaje de error si el número de cifras es mayor.

    println("Ingrese un número entero positivo de hasta tres cifras:")
    val numero = readLine()!!.toInt()

    if(numero < 10 && numero >= 0){
        println("El número tiene 1 cifra")
    }else if(numero < 100 && numero >= 10){
        println("El número tiene 2 cifras")
    }else if(numero < 1000 && numero >= 100){
        println("El número tiene 3 cifras")
    }else{
        println("Error: el número tiene más de 3 cifras o es negativo")
    }
}
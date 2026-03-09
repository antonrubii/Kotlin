package ejercicios

fun main(){
//Cargar un valor entero por teclado comprendido entre 1 y 99. Almacenar en
//otra variable la cantidad de dígitos que tiene el valor ingresado por
//teclado

    println("Ingrese un numero entre 1 y 99:")
    val numero = readLine()!!.toInt()
    val digitos: Int
    if (numero in 1..9){
        digitos = 1
        println("El numero tiene $digitos digito")
    }else if (numero in 10..99){
        digitos = 2
        println("El numero tiene $digitos digitos")
    }else {
        println("El numero esta fuera del rango especificado (1-99)")
    }



}
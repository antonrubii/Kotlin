package org.example.ejercicios
fun main() {
    //Se debe desarrollar un programa que pida el ingreso del precio de un
    //artículo y la cantidad que lleva el cliente. Mostrar lo que debe abonar el
    //comprador

    println("Precio del Articulo: ")
    val precio = readLine()!!.toDouble()

    println("Introduce la cantidad de articulos: ")
    val cantidad = readLine()!!.toInt()

    val total = precio * cantidad

    println("El total a pagar es: $total")
}


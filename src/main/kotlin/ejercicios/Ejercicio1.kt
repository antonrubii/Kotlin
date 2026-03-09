package org.example.ejercicios
        fun main() {
            println("Precio del Articulo: ")
            val precio = readLine()!!.toDouble()

            println("Introduce la cantidad de articulos: ")
            val cantidad = readLine()!!.toInt()

            val total = precio * cantidad

            println("El total a pagar es: $total")
        }


package ejercicios

fun main(){
// Se ingresan por teclado tres números, si al menos uno de los valores
//ingresados es menor a 10, imprimir en pantalla la leyenda "Alguno de los
//números es menor a diez".

    println("Ingrese el primer numero :")
    val numero1 = readLine()!!.toDouble()
    println("Ingrese el segundo numero :")
    val numero2 = readLine()!!.toDouble()
    println("Ingrese el tercer numero :")
    val numero3 = readLine()!!.toDouble()

    if (numero1 <10  || numero2 <10 || numero3 <10) {
        println("Alguno de los números es menor a diez")
    }else {
        println("Los numeros son correctos y no son menores a diez")
    }
}
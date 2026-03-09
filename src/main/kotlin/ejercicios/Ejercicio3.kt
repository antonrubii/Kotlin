package ejercicios

fun main(){
//Se ingresan tres notas de un alumno, si el promedio es mayor o igual a
//cinco mostrar un mensaje "Apto".

    println("Ingrese la primera nota:")
    val nota1 = readLine()!!.toDouble()
    println("Ingrese la segunda nota:")
    val nota2 = readLine()!!.toDouble()
    println("Ingrese la tercera nota:")
    val nota3 = readLine()!!.toDouble()

    val media = (nota1 + nota2 + nota3) / 3

    if(media >= 5){
        println("La media es: $media, el alumno es Apto")
    }else{
        println("La media es: $media, el alumno no es Apto")
    }

}
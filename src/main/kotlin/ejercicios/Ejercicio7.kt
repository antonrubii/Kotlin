package ejercicios

fun main(){
//Mostrar los múltiplos de 8 hasta el valor 500. Debe aparecer en pantalla 8
//- 16 - 24, etc.

    for(i in 1..500){
        if(i % 8 == 0){
            println("$i -")
        }
    }
}
package `04_Arreglos y Cadenas`

/*32.Encontrar el número más grande en un array: Dado un array de
números, encuentra el mayor.*/

fun main (){
    val numeros = intArrayOf(3,8,16,32,5,2)
    val mayor = numeros.maxOrNull();
    println("El núymero mayor dentro de los elementos del array es : $mayor");

}
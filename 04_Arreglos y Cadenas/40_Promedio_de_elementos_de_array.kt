package `04_Arreglos y Cadenas`

fun main() {
    val numeros = intArrayOf(10, 9, 8, 8, 10, 9, 10, 9);
    val suma = numeros.sum()
    val promedio = suma.toDouble() / 8

    println("El promedio de los números que se encuentran en el array es:  $promedio")

}
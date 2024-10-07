package `04_Arreglos y Cadenas`

fun main() {

    val Numeros = intArrayOf(8, 5, 4, 1, 5, 2, 2, 1, 7, 0, 3)

    val Duplicados = Numeros.groupBy { it }.filter { it.value.size > 1 }.keys

    println("Elementos duplicados: $Duplicados")
}

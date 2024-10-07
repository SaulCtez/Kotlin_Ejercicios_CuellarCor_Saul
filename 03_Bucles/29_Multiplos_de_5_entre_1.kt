package `03_Bucles`

fun main() {
    println("Ingrese un número n para mostrar los múltiplos de 5 entre 1 y n: ")
    val n1 = readln().toInt()

    println("Los múltiplos de 5, entre 1 y $n1 son:")

    for (i in 1..n1) {
        if (i % 5 == 0) {
            println(i)
        }
    }
}

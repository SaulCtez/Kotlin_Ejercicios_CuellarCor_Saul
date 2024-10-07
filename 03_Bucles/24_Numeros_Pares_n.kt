package `03_Bucles`

fun main() {

    println("Ingrese un número n: ")
    val num = readln().toInt()

    println("Números pares entre 1 y $num son :")
    for (i in 1..num) {
        if (i % 2 == 0) {
            println(i)
        }
    }
}

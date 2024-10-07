package `03_Bucles`

fun main() {

    println("Ingrese un número para ver su tabla de multiplicar: ")
    val num = readln().toInt()

    for (i in 1..10) {
        println("$num x $i = ${num * i}")
    }
}
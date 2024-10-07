package `03_Bucles`

fun main() {

    println("Ingrese un número para calcular su factorial: ")
    val num = readln().toInt()

    var factorial = 1

    for (i in 1..num) {
        factorial *= i
    }
    println("El factorial de $num es: $factorial")
}

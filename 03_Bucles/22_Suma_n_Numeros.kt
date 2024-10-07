package `03_Bucles`

fun main() {
    println("Ingrese un número para obtener la suma de los primeros números: ")
    val num = readln().toInt()
    var sum = 0

    for (i in 1..num) {
        sum += i
    }

    println("La suma de los primeros $num números naturales es: $sum")
}

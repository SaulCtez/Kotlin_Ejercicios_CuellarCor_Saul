package `03_Bucles`

fun main() {

    print("Ingrese un número entero para saber si es un número primo: ")
    val num = readln().toInt()

    if (num <= 1) {
        println("El número $num no es primo.")
        return
    }

    var primo = true
    var divisor = 2

    while (divisor <= num / 2) {
        if (num % divisor == 0) {
            primo = false
            break
        }
        divisor++
    }

    if (primo) {
        println("El número $num es primo.")
    } else {
        println("El número $num no es primo.")
    }
}

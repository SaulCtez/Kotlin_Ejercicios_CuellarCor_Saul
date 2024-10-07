package `03_Bucles`

fun main() {
    println("Ingrese un número entero para invertir sus dígitos: ")
    val numero = readln()

    val numeroInvertido = numero.reversed()

    println("El número invertido es: $numeroInvertido")
}

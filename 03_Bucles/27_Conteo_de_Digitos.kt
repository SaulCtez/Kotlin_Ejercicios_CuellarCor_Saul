package `03_Bucles`

fun main() {

    print("Ingresa un número entero: ")
    val numero = readln().toInt()

    val digitos = numero.toString().length

    println("El número ingresado tiene $digitos dígitos.")
}

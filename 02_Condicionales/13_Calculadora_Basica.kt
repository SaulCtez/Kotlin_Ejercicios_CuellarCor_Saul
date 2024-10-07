package `02_Condicionales`

fun main() {

    println("Ingrese el primer número: ")
    val num1 = readln().toDouble()

    println("Seleccione una operación: +, -, *, /")
    val operacion = readln()

    println("Ingrese el segundo número: ")
    val num2 = readln().toDouble()

    val resultado = when (operacion) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> {
            if (num2 != 0.0) {
                num1 / num2
            } else {
                println("Error: No se puede dividir por cero.")
                return
            }
        }
        else -> {
            println("Operación no válida.")
            return
        }
    }

    println("El resultado de $num1 $operacion $num2 es: $resultado")
}

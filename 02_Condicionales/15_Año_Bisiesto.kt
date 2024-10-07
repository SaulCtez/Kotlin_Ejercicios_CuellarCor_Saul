package `02_Condicionales`

fun main() {
    try {
        println("Ingrese un año: ")
        val year = readln().toInt()

        // Para determinar si un año es bisiesto, se utiliza la expresion when para evaluar las condiciones.
        //Un año es bisiesto si es divisible por 4, pero no lo es por 100, a excepción si también es divisible por 400.
        val Bisiesto = when {
            year % 400 == 0 -> true // Un múltiplo de 400 sigifica que es bisiesto
            year % 100 == 0 -> false // un mltiplo de 100 pero no de 400 significa que no es bisiesto
            year % 4 == 0 -> true // es un multiplo de 4 pero no de 100: es bisiesto
            else -> false // No es múltiplo de 4: no es bisiesto
        }

        if (Bisiesto) {
            println("El año $year es bisiesto.")
        } else {
            println("El año $year no es bisiesto.")
        }
    } catch (e: NumberFormatException) {
        println("No se ingresó un año válido.")
    }
}

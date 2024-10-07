package `02_Condicionales`
// Dada una calificación numérica (0-100), convierte y muestra la letra correspondiente (A, B, C, D o F).
fun main() {
    println("Ingrese la calificación numérica (0-100): ")
    try {

        val calificacion = readln().toInt()

        if (calificacion in 0..100) {

            val letra = if (calificacion >= 90) {
                "A"
            } else if (calificacion >= 80) {
                "B"
            } else if (calificacion >= 70) {
                "C"
            } else if (calificacion >= 60) {
                "D"
            } else {
                "F"
            }
            println("Obtuviste una $letra como calificación.")
        } else {
            println("La calificación ingresada no es válida. Debe estar entre 0 y 100.")
        }

    } catch (e: NumberFormatException) {
        println("No se ingresó una calificación válida.")
    }
}

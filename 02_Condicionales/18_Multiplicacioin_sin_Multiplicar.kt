package `02_Condicionales`

// Multiplica dos números sin usar el operador de multiplicación.

fun main(){

        println("Ingrese el primer número: ")
        val num1 = readln().toInt()

        println("Ingrese el segundo número: ")
        val num2 = readln().toInt()

        var resultado = 0

        for (i in 1..num2) {
            resultado += num1
        }
        println("El resultado de la multiplicación $num1 por $num2 es: $resultado")
}
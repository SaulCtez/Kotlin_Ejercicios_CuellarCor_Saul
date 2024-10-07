package `04_Arreglos y Cadenas`

fun main() {

    print("Ingrese una palabra: ")
    val palabra = readln().lowercase()

    val palabraReves = palabra.reversed()

    if (palabra == palabraReves) {
        println("La palabra '$palabra' es un palíndromo.")
    } else {
        println("La palabra '$palabra' no es un palíndromo.")
    }
}

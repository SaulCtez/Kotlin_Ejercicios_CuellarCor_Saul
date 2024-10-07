package `04_Arreglos y Cadenas`

fun main() {

    print("Ingrese una cadena: ")
    val palabra = readln().lowercase()  // se utiliza la funcion lowercarse para convertir en minusculas

    var contarVocales = 0

    // con el ciclo for se recorre cada carácter de la palabra
    for (caracter in palabra) {
        if (caracter in "aeiou") {
            contarVocales++
        }
    }

    println("La cadena contiene $contarVocales vocales.")
}

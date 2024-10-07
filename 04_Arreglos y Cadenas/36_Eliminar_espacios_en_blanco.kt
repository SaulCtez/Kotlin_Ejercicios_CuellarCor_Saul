package `04_Arreglos y Cadenas`

fun main() {
    print("Ingrese una Frase: ")
    val frase = readln()

    // Para eliminar los espacios enblanco se hace uso de la funcion predefinida replace
    val Espacio = frase.replace(" ", "")

    println("La cadena sin espacios en blanco es: '$Espacio'")
}

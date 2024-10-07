package `02_Condicionales`

// Pide el precio de un producto y aplica un descuento del 20% si supera los 1000.

fun main() {
    try {
        println("Ingrese el precio del producto: $  ")
        val precio = readln().toDouble()

        if (precio > 1000) {
            val descuento = precio * 0.20
            val precioFinal = precio - descuento
            println("Se ha aplicado un descuento del 20%. El precio final es: $precioFinal")
        } else {
            println("El precio del producto es: $precio")
        }

    } catch (e: Exception) {
        println("No se ingresó un precio válido. Por favor ingrese un número.")
    }
}

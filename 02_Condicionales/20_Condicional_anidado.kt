package `02_Condicionales`

fun main() {

   try {
       println("Ingrese un número entre 1 y 12 para saber el mes correspondiente: ")
       val num = readln().toInt()

       if (num == 1) {
           println("Enero")
       } else if (num == 2) {
           println("Febrero")
       } else if (num == 3) {
           println("Marzo")
       } else if (num == 4) {
           println("Abril")
       } else if (num == 5) {
           println("Mayo")
       } else if (num == 6) {
           println("Junio")
       } else if (num == 7) {
           println("Julio")
       } else if (num == 8) {
           println("Agosto")
       } else if (num == 9) {
           println("Septiembre")
       } else if (num == 10) {
           println("Octubre")
       } else if (num == 11) {
           println("Noviembre")
       } else if (num == 12) {
           println("Diciembre")
       } else {
           println("Número no valido. Debe ingresar un número entre 1 y 12.")
       }
   } catch (e:NumberFormatException)
    {
        println("No se ingreso un número valido")
    }
}

package Variables_y_Tipos_de_Datos

fun main() {
    println("Ingresa un primer valor: ")
    var n1 = readln().toDouble();
    println("Ingresa un segundo valor: ")
    var n2 = readln().toDouble();

    var suma: Double = n1+n2;
    println("El resultado de la suma es : $suma ");
}
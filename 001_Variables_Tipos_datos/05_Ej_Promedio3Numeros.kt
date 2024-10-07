package Variables_y_Tipos_de_Datos

//Promedio de tres números: Solicita tres números y calcula su
//promedio.

fun main () {
    println("Ingresa un primer valor: ");
    var n1 = readln().toDouble();
    println("Ingresa un segundo valor: ");
    var n2 = readln().toDouble();
    println("Ingresa un tercer valor: ");
    var n3 = readln().toDouble();

    var promedio = (n1+n2+n3)/3;
    println("El promedio es $promedio ")

}
package Variables_y_Tipos_de_Datos

fun main(){
    println("Ingresa un primer valor: ");
    var n1 = readln().toDouble();
    println("Ingresa un segundo valor: ");
    var n2 = readln().toDouble();

    var otro = n1;

    n1 = n2;
    n2 = otro;


    println("El primer valor es $n1")
    println("El segundo valor es $n2")

}
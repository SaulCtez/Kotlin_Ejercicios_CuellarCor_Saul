package Variables_y_Tipos_de_Datos

// Convierte una distancia dada en metros a kilómetros.

fun main(){
    println("Ingrese la cantidad en metros para convertir a Kilometros: ");

    try{
        val metro = readln().toDouble();
        val kil = metro / 1000;
        println(" $metro metros, equivale a: $kil Kilometros  ");

    } catch ( e:NumberFormatException){
        println("Ingrese la cantidad de metros con números")
    }

}
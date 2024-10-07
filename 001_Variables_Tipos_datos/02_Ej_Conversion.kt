package Variables_y_Tipos_de_Datos

fun main(){
    println("Ingrese los grados Celcius para convertirlos a Fahrenheit: ")
    var celc = readln().toDouble();
    //Formula para obtener los grados fahrernheit
    val far = (celc * 9/5)+32;
    println(" $celc °C, Equivale a $far grados Fahrenheit  ")


}
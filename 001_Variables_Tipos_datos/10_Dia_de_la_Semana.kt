package Variables_y_Tipos_de_Datos

fun main(){
     try{
         println("Ingrese un número entre 1 y 7 para saber los dias de la semana: ")
         val dia = readln().toInt();
         when (dia){
             1-> println("Lunes");
             2-> println("Martes");
             3-> println("Miercoles");
             4-> println("Jueves");
             5-> println("Viernes");
             6-> println("Sabado");
             7-> println("Domingo");
             else-> println("Número invalido");
         }

     } catch (e: NumberFormatException){
         println("Ingrese un númro de 1 a 7.")

     }


}
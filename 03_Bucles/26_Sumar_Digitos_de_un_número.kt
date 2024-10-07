package `03_Bucles`


fun main() {

    print("Ingrese un número entero para calcular la suma de sus digitos: ")
    var num = readLine()?.toIntOrNull() ?: return

    var sumaDigitos = 0

    while (num != 0) {
        val digito = num % 10
        sumaDigitos += digito
        num /= 10
    }

    println("La suma de los dígitos es: $sumaDigitos")
}

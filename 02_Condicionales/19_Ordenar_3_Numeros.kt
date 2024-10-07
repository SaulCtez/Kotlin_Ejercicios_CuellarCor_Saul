package `02_Condicionales`

fun main (){
    println("Ingrese el primer número: ");
    val num1 = readln().toInt();

    println("Ingrese un segundo número: ");
    val num2 = readln().toInt();

    println("Ingrese un tercer número: ");
    val num3 = readln().toInt();

    var mayor: Int
    var medio: Int
    var menor: Int

    if (num1 > num2 && num1 > num3) {
        mayor = num1
        if (num2 > num3) {
            medio = num2
            menor = num3
        } else {
            medio = num3
            menor = num2
        }
    } else if (num2 > num1 && num2 > num3) {
        mayor = num2
        if (num1 > num3) {
            medio = num1
            menor = num3
        } else {
            medio = num3
            menor = num1
        }
    } else {
        mayor = num3
        if (num1 > num2) {
            medio = num1
            menor = num2
        } else {
            medio = num2
            menor = num1
        }
    }

    println("El número mayor es: $mayor")
    println("El número intermedio es: $medio")
    println("El número menor es: $menor")
}


package tablaMultiplicar

fun main() {
    var num1: Int
    var num2: Int

    do {
        print("Dime el primer número del 1 al 10: ")
        num1 = readln().toIntOrNull() ?: -1
    } while(num1 < 1 || num1 > 10)

    do {
        print("Dime el segundo número del 1 al 10: ")
        num2 = readln().toIntOrNull() ?: -1
    } while(num2 < 1 || num2 > 10)

    val tabla1 = """
        ==========================
        TABLA DE MULTIPLICAR DEL $num1
        ==========================
        """.trimIndent()

    val tabla2 = """
        ==========================
        TABLA DE MULTIPLICAR DEL $num2
        ==========================
        """.trimIndent()

    println(tabla1)
    for (i in 0 .. 10) {
        println("$i x $num1 = " + i*num1)
    }

    println(tabla2)
    for (i in 0 .. 10) {
        println("$i x $num2 = " + i*num2)
    }
}
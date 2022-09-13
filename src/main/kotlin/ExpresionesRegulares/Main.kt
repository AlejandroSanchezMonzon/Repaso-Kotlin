package ExpresionesRegulares

fun main() {
    var isValid: Boolean

    do {
        print("Dime tu correo electrónico: ")
        val email = readln().matches(Regex("[a-z0-9]+@[a-z]+\\.[a-z]{2,3}"))

        isValid = email

    } while (!isValid)

    do {
        print("Dime tu DNI: ")
        val dni = readln().matches(Regex("""\d{8}[A-Za-z]"""))
    } while (!dni)

    do {
        print("Dime tu número de cuenta: ")
        val cuenta = readln().matches(Regex("""\d{16}"""))
    } while (!cuenta)
}
fun main() {
    val ioManager: InputOutputManager = ConsoleInputOutputManager()
    val generador = GeneradorSecuencias(ioManager)

    var numWords: Int?
    do {
        numWords = ioManager.readInt("Introduce el número de palabras para la frase incremental: ")
        if (numWords == null) {
            ioManager.println("Error: Debe introducir un número entero válido.")
        } else {
            generador.fraseIncremental(numWords)
        }
    } while (numWords == null)

    do {
        numWords = ioManager.readInt("Introduce el número de palabras para la frase final: ")
        if (numWords == null) {
            ioManager.println("Error: Debe introducir un número entero válido.")
        } else {
            generador.fraseFinal(numWords)
        }
    } while (numWords == null)
}
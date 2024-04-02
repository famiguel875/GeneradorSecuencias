class GeneradorSecuencias(private val ioManager: InputOutputManager) {
    private var sec: List<String>? = null

    private fun readWords(numWords: Int): List<String> {
        val words = mutableListOf<String>()
        repeat(numWords) {
            val word = ioManager.readLine("Introduce una palabra: ")
            if (!word.isNullOrBlank()) {
                words.add(word)
            } else {
                ioManager.println("Error: Debes introducir una palabra válida.")
            }
        }
        return words
    }

    fun fraseIncremental(numWords: Int) {
        sec = readWords(numWords)
        sec?.forEach { ioManager.println(it) }
    }

    fun fraseFinal(numWords: Int) {
        sec = readWords(numWords)
        ioManager.println(sec?.joinToString(" ") ?: "")
    }
}
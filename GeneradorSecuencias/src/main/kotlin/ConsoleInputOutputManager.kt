class ConsoleInputOutputManager : InputOutputManager {
    override fun readInt(prompt: String): Int? {
        print(prompt)
        return readlnOrNull()?.toIntOrNull()
    }

    override fun readLine(prompt: String): String? {
        print(prompt)
        return readlnOrNull()
    }

    override fun println(message: String) {
        kotlin.io.println(message) // Corrección: Llama a la función println de la consola estándar
    }
}
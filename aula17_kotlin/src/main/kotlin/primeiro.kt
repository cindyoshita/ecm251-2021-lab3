class primeiro {
    /**
     * You can edit, run, and share this code.
     * play.kotlinlang.org
     */

    fun main(args: Array<String>) {
        // Declara uma variavel
        // var nome = "Cindy"
        // var sobreNome = "Yoshita"
        // Declara constantes
        // Solução 1
        val nome: String? // Esse é nulo
        val sobreNome: String?
        println("Informe seu nome:")
        nome = readLine()
        println("Informe seu sobrenome:")
        sobreNome = readLine()
        println("BEM Vindo ao mundo de kotlin $nome $sobreNome")
    }

    fun main(args: Array<String>) {
        // Declara uma variavel
        // var nome = "Cindy"
        // var sobreNome = "Yoshita"
        // Declara constantes
        // Solução 2
        val nome: String
        val sobreNome: String
        println("Informe seu nome:")
        nome = readLine()!! // Dizer q esse é nulo
        println("Informe seu sobrenome:")
        sobreNome = readLine()!!
        println("BEM Vindo ao mundo de kotlin $nome $sobreNome")
    }

    fun main(args: Array<String>) {
        // Declara uma variavel
        // var nome = "Cindy"
        // var sobreNome = "Yoshita"
        // Declara constantes
        // Solução 3
        val nome: String
        val sobreNome: String
        println("Informe seu nome:")
        nome = readLine() ?:"NOME PADRÃO" // Testa para ver se esse é nulo, se for nulo usa o q esta depois do ?:
        println("Informe seu sobrenome:")
        sobreNome = readLine() ?:"SOBRENOME PADRÃO"
        println("BEM Vindo ao mundo de kotlin $nome $sobreNome")
    }

}
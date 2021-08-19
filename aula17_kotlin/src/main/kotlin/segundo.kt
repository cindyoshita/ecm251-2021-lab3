class segundo {
    //variaveus atribuidas
    fun soma(numero1 : Double, numero2 : Double ) = numero1 + numero2 // Retorna esse se n tem retorno

    fun subtracao(numero1 : Double, numero2: Double) : Double{
        return numero1 - numero2
    }

    // Unit = void
    fun exibirResultado(resultado: Double): Unit{
        println("Resultado: $resultado")
    }
    fun main(){
        val numero1 : Double
        val numero2 : Double
        numero1 = 10.toDouble()
        numero2 = "24.5".toDouble()
        println("Soma: ${soma(numero1, numero2)}")
        println("Subtracao: ${subtracao(numero1, numero2)}")
    }
}
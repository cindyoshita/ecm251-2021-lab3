import java.time.LocalDateTime
class Pessoa(val nome:String, val idade: Int){
    fun exibirDados() {
        println("Meus dados: ${this.nome} - ${this.idade}")
    }
}

class superPessoa(nome: String, ano: Int){
    val nome: String = nome
        get (){
            return "Ola Meu nome é: ${field}"
        }
    val anoNascimento: Int
    var idade: Int = 0
        set(value){
            if (value < 0)
                return

            field = value
        }
    //Comportamento do construtor
    init{
        this.anoNascimento = ano
        this.idade = LocalDateTime.now().year - ano
    }

    fun exibirDados(){
        println("Meus dados: ${this.nome} - ${this.idade}")
    }
}

fun main(){
    val p1 = Pessoa("Cindy" , 21)
    val p2 = Pessoa("Murilo", 32)
    val p3 = superPessoa("Midoriya", 2005)
    p1.exibirDados()
    p2.exibirDados()
    p3.exibirDados()
    // Não é possível reatribuir um objeto declarado como val
    //p4 = superPessoa("Bakugo", 2004)
    p3.idade = 34
    p3.exibirDados()
    p3.idade = -67
    p3.exibirDados()
}
package yoshita.cindy;

public class Pessoa {
    // CONSIGO alterar o nome da pessoa DENTRO da classe. Fora dela n dá
    private final String nome;
    private final String cpf;
    public int mudar;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // NÂO FUNCIOMA (ERRO) pq o nome e cpf são finals
    //public void mudaTudo(){
    //    nome = "Saitama";
    //            cpf = "11111111111";
    //}

    public String Ola(){
        return "Ola! Eu sou " + this.nome;
    }
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", mudar='" + mudar + '\'' +
                '}';
    }
}

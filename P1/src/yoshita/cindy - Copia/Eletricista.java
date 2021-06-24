package yoshita.cindy;

public class Eletricista extends Funcionário{
    @Override
    public String nome(String nome) {
        return "Sara";
    }

    @Override
    public String telefone(String string) {
        return "222";
    }

    @Override
    public double salario(double salario) {
        return 33;
    }

    @Override
    public boolean trabalho(boolean trabalho) {
        return true;
    }

    public void descricao() {
        System.out.println("Meu nome é" + this.nome("nome") + "/n Meu telefone é" + this.telefone("000") + "/n Meu salario é" + this.salario(0.0));
    }

    public boolean  executarTrabalho() {
        if(this.trabalho(true)){
            return true;
        }else
        {
            return false;
        }
    }
}


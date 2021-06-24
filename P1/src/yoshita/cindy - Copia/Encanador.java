package yoshita.cindy;

public class Encanador extends Funcionário{
    @Override
    public String nome(String nome) {
        return "Cleide";
    }

    @Override
    public String telefone(String string) {
        return "111";
    }

    @Override
    public double salario(double salario) {
        return 150;
    }

    @Override
    public boolean trabalho(boolean trabalho) {
        return false;
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

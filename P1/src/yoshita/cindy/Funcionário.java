package yoshita.cindy;

public abstract class  Funcionário {
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

    public abstract String nome(String nome);
    public abstract String telefone(String string);
    public abstract double salario(double salario);
    public abstract boolean trabalho(boolean trabalho);
}
package yoshita.cindy;

public class Eletricista extends Funcionário{
    @Override
    public String nome(String nome) {
        return "Sara";
    }

    @Override
    public String telefone(String string) {
        return "333";
    }

    @Override
    public double salario(double salario) {
        return 12;
    }

    @Override
    public boolean trabalho(boolean trabalho) {
        return true;
    }
}


package yoshita.cindy;

public class Encanador extends Funcionário{
    @Override
    public String nome(String nome) {
        return "Roberto";
    }

    @Override
    public String telefone(String string) {
        return "222";
    }

    @Override
    public double salario(double salario) {
        return 99;
    }

    @Override
    public boolean trabalho(boolean trabalho) {
        return false;
    }
}

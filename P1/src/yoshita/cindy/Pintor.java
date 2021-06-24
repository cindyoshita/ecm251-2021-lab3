package yoshita.cindy;

public class Pintor extends Funcionário{
    @Override
    public String nome(String nome) {
        return "Claudio";
    }

    @Override
    public String telefone(String string) {
        return "111";
    }

    @Override
    public double salario(double salario) {
        return 120.9;
    }

    @Override
    public boolean trabalho(boolean trabalho) {
        return false;
    }
}

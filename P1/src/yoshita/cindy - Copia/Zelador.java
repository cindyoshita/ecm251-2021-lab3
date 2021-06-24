package yoshita.cindy;

public class Zelador extends Funcionário{
    @Override
    public String nome(String nome) {
        return "Claudia";
    }

    @Override
    public String telefone(String string) {
        return "444";
    }

    @Override
    public double salario(double salario) {
        return 34;
    }

    @Override
    public boolean trabalho(boolean trabalho) {
        return true;
    }


}

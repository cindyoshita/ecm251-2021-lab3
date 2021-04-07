package yoshita.cindy;

public class Contas {
    protected double saldo;
    private int idConta;
    private Usuarios usuario;

    public Contas(int idConta, double saldo, Usuarios usuario) {
        this.idConta = idConta;
        this.saldo = saldo;
        this.usuario = usuario;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void tirarSaldo(double saldo) {
        this.saldo -= saldo;
    }

    public int getIdConta() {
        return this.idConta;
    }

    public boolean sacar(double valor) {
        if (valor <= this.saldo) {
            this.tirarSaldo(valor);
            return true;
        } else {
            return false;
        }
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public String transformarQRcode(double valorDesejado) {
        int var10000 = this.idConta;
        return var10000 + ";" + this.usuario.nome + ";" + valorDesejado + ";" + Transacoes.getRandomNumberInRange(1000, 9999);
    }

    public String toString() {
        return "Contas{saldo=" + this.saldo + ", idConta=" + this.idConta + "}";
    }
}
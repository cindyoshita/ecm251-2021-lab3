package yoshita.cindy;

import java.sql.SQLOutput;

public class Conta {
    private int numero;
    public double saldo;
    private Cliente cliente;


    //metodos da classe



    public double getSaldo(){
        return this.saldo;
    }

    public void visualizarSaldo() {
        double saldo = this.saldo; // so mexi na variável local (199.99) se eu printar 2 vezes ele volta no atributo inicial do this(199.99)
        //se eu tirar esse double se printar 2 vezes na segunda vez volta a fazer o processo com o q restou
        System.out.println("Saldo da conta : R$" + this.saldo);
        /*while(saldo > 0){
            System.out.println("Gastando!!!" + saldo);
            saldo = saldo - 10;
        }*/
    }
    public void depositar(double valor) {
        //this.saldo = this.saldo +valor;
        this.saldo += valor;
    }
    public boolean sacar(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }
    public boolean transferirPara(double valor, Conta destino) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                ", cliente=" + cliente.toString() +
                '}';
    }
}

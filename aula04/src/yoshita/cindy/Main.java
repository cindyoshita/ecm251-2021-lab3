package yoshita.cindy;

public class Main {

    public static void main(String[] args) {
        System.out.println("Quase 5 temporada");
        // Criar uma referência para conta
    Conta c1; //guardar o endereço
    //Instanciar um objeto Conta
    c1 = new Conta();// faz a ligação do c1 na Conta


    c1.depositar(300);
    c1.sacar(250);
    c1.saldo = 300;
    c1.visualizarSaldo();

}}


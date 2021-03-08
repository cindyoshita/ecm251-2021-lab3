package yoshita.cindy;

public class Main {

    public static void main(String[] args) {
        System.out.println("Quase 5 temporada");
        // Criar uma referência para conta
    Conta c1; //guardar o endereço
    //Instanciar um objeto Conta
    c1 = new Conta();// faz a ligação do c1 na Conta
    c1.cliente = new Cliente();

    c1.cliente.titular = "Inuyasha";
    c1.saldo = 199.99; // acesso os atributos da conta pelo atributo "."
    c1.visualizarSaldo();
    c1.visualizarSaldo();

    Conta c2 = new Conta();
    c2.cliente = new Cliente();
    c2.cliente.titular = "Seichomaru";
    c2.saldo = 1000;
    c2.visualizarSaldo();

    c1.depositar(20);
    c2.depositar(35.99);

    c1.visualizarSaldo();
    c2.visualizarSaldo();

    if(c1.sacar(100)){
        System.out.println("Deu bom!");
    }else{
        System.out.println("Deu ruim!");
    }
    c1.visualizarSaldo();

    if(c1.transferirPara(1000,c2)){
        System.out.println("Transferiu");
    } else{
        System.out.println("NÂO transefriu");
    }

    c1.visualizarSaldo();
    c2.visualizarSaldo();
        System.out.println("c1:" +c1.toString());
        System.out.println("c2:" +c2.toString());
    }
}

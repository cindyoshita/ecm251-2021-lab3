package maua.cindy.thiago.sistema;


import maua.cindy.thiago.model.Membro;
import maua.cindy.thiago.sistema.metodos.MudarHorario;
import java.util.Scanner;

public class Sistema {
    public void Menu(){

        MudarHorario mh = new MudarHorario();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo!! Digite qual opção deseja selecionar: \n" +
                "1 - Mudar Horario \n" + "2 - Cadastrar um usuário \n" + "3 - Postar uma mensagem para cada funcionário \n"
                + "4 - Excluir funcionário \n" +"0 - Fechar o sistema \n" );

        int op = scanner.nextInt();

        switch (op){
            case 1:
                System.out.println("Voce escolheu Mudar o horario");
                mh.mudarHorario(mh.scanner());
                break;
            case 2:
                break;
            case 3:
                System.out.println("break");
        }

    }

}
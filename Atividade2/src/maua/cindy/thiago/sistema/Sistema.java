package maua.cindy.thiago.sistema;


import maua.cindy.thiago.sistema.metodos.MudarHorario;
import java.util.Scanner;

public class Sistema {
    public void Menu(){

        MudarHorario mh = new MudarHorario();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo!! Digite qual opção deseja selecionar: \n" +
                "1 - Mudar Horario");

        int op = scanner.nextInt();

        switch (op){
            case 1:
                System.out.println("Voce escolheu Mudar o horario");
                mh.mudarHorario();
                break;
        }

    }

}
package maua.cindy.thiago.sistema.metodos;

import maua.cindy.thiago.enumeracoes.TipoHorario;

import java.util.Scanner;

public class MudarHorario {

    public String scanner(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o periodo que deseja mudar:");
        String hora = scanner.nextLine();
        return hora;
    }
    public TipoHorario mudarHorario(String hora) {

        if (hora.equalsIgnoreCase("Regular")) {
            System.out.println("Agora voce esta em horario REGULAR!");
            return TipoHorario.REGULAR;

        } else if (hora.equalsIgnoreCase("Extra")) {
            System.out.println("Agora voce esta em horario EXTRA");
            return TipoHorario.EXTRA;
        }

        return null;
    }
}

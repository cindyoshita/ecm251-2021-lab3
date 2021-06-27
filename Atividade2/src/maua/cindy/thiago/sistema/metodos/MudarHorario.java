package maua.cindy.thiago.sistema.metodos;

import maua.cindy.thiago.enumeracoes.TipoHorario;

import java.util.Scanner;



public class MudarHorario {
    /**Faz um scanner que, dependendo do seu input, ira transformar e retornar o parametro em REGULAR ou EXTRA
     *
     * @param a Controle para armazenar o ENUM REGULAR ou EXTRA
     * @return Retorna, dependendo do scanner, REGULAR, EXTRA ou null
     */
    public TipoHorario mudarHorario(TipoHorario a) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o periodo que deseja mudar:");
        String hora = scanner.nextLine();

        if (hora.equalsIgnoreCase("Regular")) {
            System.out.println("Agora voce esta em horario REGULAR!");
            a = TipoHorario.REGULAR;
            return TipoHorario.REGULAR;

        } else if (hora.equalsIgnoreCase("Extra")) {
            System.out.println("Agora voce esta em horario EXTRA");
            a = TipoHorario.EXTRA;
            return TipoHorario.EXTRA;
        }

        return null;
    }
}

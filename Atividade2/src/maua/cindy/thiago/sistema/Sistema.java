package maua.cindy.thiago.sistema;

import maua.cindy.thiago.enumeracoes.TipoHorario;

import java.util.Scanner;

public class Sistema {
    private Scanner scanner;

    public TipoHorario mudarHorario(){
        System.out.println("Digite o periodo:");
        String hora = scanner.next();
        if(hora.equalsIgnoreCase("Regular")){
            return TipoHorario.REGULAR;
        }else if(hora.equalsIgnoreCase("Extra")){
            return TipoHorario.EXTRA;
        }

        return null;
    }

}

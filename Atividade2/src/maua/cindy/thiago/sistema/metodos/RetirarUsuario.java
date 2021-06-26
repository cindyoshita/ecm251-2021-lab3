package maua.cindy.thiago.sistema.metodos;

import maua.cindy.thiago.enumeracoes.TipoHorario;
import maua.cindy.thiago.enumeracoes.TipoMembros;

import java.util.Scanner;

public class RetirarUsuario {
    public void retirar(TipoMembros tm){
        RegistrarUsuario ru = new RegistrarUsuario();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sigla da categoria de funcionario o qual deseja retirar: \n" +
                "bb -> BIGBROTHERS\n" +
                "hl -> HEAVYLIFTERS\n" +
                "mm -> MOBILEMEMBERS\n" +
                "sg -> SCRIPTGUYS\n");
        String cargo =  scanner.nextLine();
        if(cargo.equalsIgnoreCase("bb")){
            tm = TipoMembros.BIGBROTHERS;

        }else if(cargo.equalsIgnoreCase("hl")){
            tm = TipoMembros.HEAVYLIFTERS;
        }else if(cargo.equalsIgnoreCase("mm")){
            tm = TipoMembros.MOBILEMEMBERS;
        }else if(cargo.equalsIgnoreCase("sg")){
            tm = TipoMembros.SCRIPTGUYS;
        }


    }

}

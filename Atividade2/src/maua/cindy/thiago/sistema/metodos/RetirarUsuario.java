package maua.cindy.thiago.sistema.metodos;

import maua.cindy.thiago.enumeracoes.TipoHorario;
import maua.cindy.thiago.enumeracoes.TipoMembros;
import maua.cindy.thiago.registro.Usuario;

import java.util.Scanner;

public class RetirarUsuario {
    public void retirar(){
        TipoMembros auxtm = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sigla da categoria de funcionario o qual deseja retirar: \n" +
                "bb -> BIGBROTHERS\n" +
                "hl -> HEAVYLIFTERS\n" +
                "mm -> MOBILEMEMBERS\n" +
                "sg -> SCRIPTGUYS\n");
        String cargo =  scanner.nextLine();
        if(cargo.equalsIgnoreCase("bb")){
            auxtm = TipoMembros.BIGBROTHERS;
        }else if(cargo.equalsIgnoreCase("hl")){
            auxtm = TipoMembros.HEAVYLIFTERS;
        }else if(cargo.equalsIgnoreCase("mm")){
            auxtm = TipoMembros.MOBILEMEMBERS;
        }else if(cargo.equalsIgnoreCase("sg")){
            auxtm = TipoMembros.SCRIPTGUYS;
        }

        for (Usuario usuario: Usuario.usuarioListado){
            if (auxtm == usuario.tm) {

                System.out.println("Qual o indice do cargo" + cargo + "o qual deseja retirar");
                int indice = scanner.nextInt();

                Usuario.usuarioListado.remove(indice);
            }
            else{
                System.out.println("n estou funcionando");
            }
        }
    }

}

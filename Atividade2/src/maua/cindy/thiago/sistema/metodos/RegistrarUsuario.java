package maua.cindy.thiago.sistema.metodos;


import maua.cindy.thiago.enumeracoes.TipoMembros;
import maua.cindy.thiago.model.membros.BigBrothers;
import maua.cindy.thiago.model.membros.HeavyLifters;
import maua.cindy.thiago.model.membros.MobileMembers;
import maua.cindy.thiago.model.membros.ScriptGuys;
import maua.cindy.thiago.registro.Usuario;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class RegistrarUsuario {
    public void registro(TipoMembros tm){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sigla da categoria de funcionario o qual deseja cadastrar: \n" +
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

        System.out.println("Digite o nome que deseja registrar:");
        String nomeUsuario = scanner.nextLine();

        System.out.println("Digite o email que deseja registrar:");
        String email = scanner.nextLine();

        System.out.println("Digite o iD que deseja registrar:");
        int identificacao = scanner.nextInt();


        new Usuario(nomeUsuario, identificacao, email, tm);
        System.out.println(Usuario.usuarioListado);

    }

    public void serializarRegistro()throws Exception {
        FileWriter fw = new FileWriter("arquivo_super_Secreto_nao_abrir.csv");
        TipoMembros tm = TipoMembros.BIGBROTHERS;
        registro(tm);
        for(Usuario usuario1 : Usuario.usuarioListado){
            fw.write(Usuario.usuarioListado.toString());

        }
        fw.close();
    }



}

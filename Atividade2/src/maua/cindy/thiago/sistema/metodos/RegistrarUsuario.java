package maua.cindy.thiago.sistema.metodos;


import maua.cindy.thiago.enumeracoes.TipoMembros;
import maua.cindy.thiago.registro.Usuario;

import java.io.FileWriter;
import java.util.Scanner;


public class RegistrarUsuario {
    public void registro(TipoMembros tm, int i){
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

        new Usuario(nomeUsuario, i, email, tm);
        System.out.println(Usuario.usuarioListado);

    }

    public void serializarRegistro(int i)throws Exception {
        FileWriter fw = new FileWriter("arquivo_super_Secreto_nao_abrir.csv");
        TipoMembros tm = null;
        registro(tm,i);

        for(Usuario usuario1 : Usuario.usuarioListado){
            fw.append(usuario1.toString() + "\n");
        }
        fw.close();
    }

}

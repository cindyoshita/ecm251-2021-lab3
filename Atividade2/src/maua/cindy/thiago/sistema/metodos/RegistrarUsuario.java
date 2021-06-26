package maua.cindy.thiago.sistema.metodos;


import maua.cindy.thiago.registro.Usuario;

import java.io.FileWriter;
import java.util.Scanner;

public class RegistrarUsuario {
    public void registro(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome que deseja registrar:");
        String nomeUsuario = scanner.nextLine();

        System.out.println("Digite o email que deseja registrar:");
        String email = scanner.nextLine();

        System.out.println("Digite o iD que deseja registrar:");
        int identificacao = scanner.nextInt();

        new Usuario(nomeUsuario, identificacao, email);
        System.out.println(Usuario.usuarioListado);

    }

    public void serializarRegistro()throws Exception {
        FileWriter fw = new FileWriter("arquivo_super_Secreto_nao_abrir.csv");
        registro();
        for(Usuario usuario1 : Usuario.usuarioListado){
            fw.append(Usuario.usuarioListado.toString());

        }
        fw.close();
    }


}

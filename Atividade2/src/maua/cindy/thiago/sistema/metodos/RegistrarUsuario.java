package maua.cindy.thiago.sistema.metodos;


import maua.cindy.thiago.enumeracoes.TipoMembros;
import maua.cindy.thiago.registro.Usuario;

import java.util.Scanner;

public class RegistrarUsuario {
    public void registro(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome que deseja mudar:");
        String nomeUsuario = scanner.nextLine();

        System.out.println("Digite o email que deseja mudar:");
        String email = scanner.nextLine();

        System.out.println("Digite o iD que deseja mudar:");
        int identificacao = scanner.nextInt();

        new Usuario(nomeUsuario, identificacao, email, TipoMembros.BIGBROTHERS);
        System.out.println(Usuario.usuarioListado);

    }

}

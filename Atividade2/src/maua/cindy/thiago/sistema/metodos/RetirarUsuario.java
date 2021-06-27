package maua.cindy.thiago.sistema.metodos;

import maua.cindy.thiago.enumeracoes.TipoHorario;
import maua.cindy.thiago.enumeracoes.TipoMembros;
import maua.cindy.thiago.registro.Usuario;

import java.util.Scanner;

public class RetirarUsuario {
    public void retirar(){
        Scanner scanner = new Scanner(System.in);
        for (Usuario usuario: Usuario.usuarioListado){

                System.out.println("Qual o id que deseja retirar");
                int indice = scanner.nextInt();

                Usuario.usuarioListado.remove(indice-1);

        }
    }

}

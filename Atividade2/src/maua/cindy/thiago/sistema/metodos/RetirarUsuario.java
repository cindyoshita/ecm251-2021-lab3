package maua.cindy.thiago.sistema.metodos;

import maua.cindy.thiago.registro.Usuario;

import java.util.Scanner;

public class RetirarUsuario {
    /**
     * Faz um scanner para armazenar o id do usuario e com base nesse id, ele sera removido
     */
    public void retirar(){
        Scanner scanner = new Scanner(System.in);
        for (Usuario usuario: Usuario.usuarioListado){

                System.out.println("Qual o id que deseja retirar");
                int indice = scanner.nextInt();

                Usuario.usuarioListado.remove(indice-1);

        }
    }

}

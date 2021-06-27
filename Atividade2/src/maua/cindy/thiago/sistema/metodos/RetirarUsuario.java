package maua.cindy.thiago.sistema.metodos;

import maua.cindy.thiago.enumeracoes.TipoMembros;
import maua.cindy.thiago.registro.Usuario;

import java.util.Scanner;

public class RetirarUsuario {
    /**
     * Faz um scanner para armazenar a posicao do usuario que deseja-se retirar
     */
    public void retirar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a posição (utilize o relatorio para saber a posição) que deseja retirar");
        int indice = scanner.nextInt();

        Usuario.usuarioListado.remove(indice - 1);


}}


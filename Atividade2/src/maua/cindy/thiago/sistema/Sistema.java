package maua.cindy.thiago.sistema;


import maua.cindy.thiago.enumeracoes.TipoHorario;

import maua.cindy.thiago.sistema.metodos.*;

import java.util.Scanner;

/**
 * Classe responsável pela interação principal com o usuário
 */
public class Sistema {
    private boolean continuarExecucao;
    private static Scanner scanner;
    public TipoHorario a = TipoHorario.REGULAR;
    int i =1;

    /**
     * Incializa o método executar
     * @throws Exception Joga uma excessão
     */
    public void start() throws Exception {
    this.executar();
}

    /**
     * Ativa o método exibirMenu, cria um scanner, faz com que leia um numero inteiro ,inicializa o menu
     *Faz com que o menu continue a ser executado enquanto o booleano continuar a fazer a execução enquanto esse estiver true
     * @throws Exception Joga uma excessão
     */
    public void executar() throws Exception {
        this.continuarExecucao = true;
        scanner = new Scanner(System.in);
        while(this.continuarExecucao) {
            this.exibirMenu();
            int opcao = Integer.parseInt(scanner.nextLine());
            this.menu(opcao);
        }

    }

    /**
     * Cria o Switch Case responsavel por: fechar o menu, mudar o horario de trabalho, cadastrar novos membros, postar mensagem caracteristica de cada membro,
     *responsavel por retirar membros e apresentar relatorio com todos os membros
     * @param opcao Numero inteiro para selecionar qual caso do Switch case devera ser selecionado
     * @throws Exception Joga uma excessao
     */
    public void menu(int opcao) throws Exception {

        MudarHorario mh = new MudarHorario();

        switch (opcao){
            case 0:
                System.out.println("Obrigado pela preferencia");
                this.continuarExecucao = false;
                break;
            case 1:
                System.out.println("Voce escolheu Mudar o horario");
                a = mh.mudarHorario(a);
                break;
            case 2:
                RegistrarUsuario registrar = new RegistrarUsuario();
                registrar.serializarRegistro(i);
                i +=1;
                break;
            case 3:
                Mensagem m = new Mensagem();
                m.mensagemParaTodos(a);
                break;
            case 4:
                RetirarUsuario retirarUsuario = new RetirarUsuario();
                retirarUsuario.retirar();
                break;
            case 5:
                ApresentarUsuario au = new ApresentarUsuario();
                au.apresentar();
                break;
            default:
                System.out.println("Funcionalidade ainda não implementada");
        }

    }

    /**
     *Exibe o menu de boas vindas
     */
    private void exibirMenu() {

        System.out.println("Bem vindo!!Voce esta no horario " + a + " Digite qual opção deseja selecionar:");
        System.out.println("1 - Mudar Horario");
        System.out.println("2 - Cadastrar um usuário ");
        System.out.println("3 - Postar uma mensagem para cada funcionário");
        System.out.println("4 - Excluir funcionário");
        System.out.println("5 - Apresentar relatório");
        System.out.println("0 - Sair do sistema");

    }

}
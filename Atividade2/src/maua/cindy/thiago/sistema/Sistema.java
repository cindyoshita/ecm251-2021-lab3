package maua.cindy.thiago.sistema;


import maua.cindy.thiago.enumeracoes.TipoHorario;
import maua.cindy.thiago.model.Membro;
import maua.cindy.thiago.model.membros.BigBrothers;
import maua.cindy.thiago.model.membros.HeavyLifters;
import maua.cindy.thiago.model.membros.MobileMembers;
import maua.cindy.thiago.model.membros.ScriptGuys;
import maua.cindy.thiago.sistema.metodos.*;

import java.util.Scanner;

public class Sistema {
    private boolean continuarExecucao;
    private static Scanner scanner;
    public TipoHorario a = TipoHorario.REGULAR;

    public void start() throws Exception {
    this.executar();
}
    public void executar() throws Exception {
        this.continuarExecucao = true;
        scanner = new Scanner(System.in);
        while(this.continuarExecucao) {
            this.exibirMenu();
            int opcao = Integer.parseInt(scanner.nextLine());
            this.Menu(opcao);
        }

    }
    public void Menu(int opcao) throws Exception {

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
                registrar.serializarRegistro();
                break;
            case 3:
                Mensagem m = new Mensagem();
                m.mensagemParaTodos(a);
                break;
            case 4:
                RetirarUsuario retirarUsuario = new RetirarUsuario();
                break;
            case 5:
                ApresentarUsuario au = new ApresentarUsuario();
                au.apresentar();
                break;
        }

    }

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
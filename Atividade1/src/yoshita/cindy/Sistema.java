package yoshita.cindy;


import java.util.Iterator;
import java.util.Scanner;

public class Sistema {
    private boolean continuarExecucao;
    private Contas conta;
    private static Usuarios usuarioLogado;
    private static Scanner scanner;

    public Sistema() {
    }

    public void start() {
        new Usuarios("Joao", "Joao123", "Joao@", 1000.0D, 111);
        new Usuarios("Guilherme", "Guilherme123", "Guilherme@", 250.0D, 222);
        new Usuarios("Maria", "Maria123", "Maria@", 3000.0D, 333);
        this.logarUsuario();
    }

    public void logarUsuario() {
        System.out.println("Qual o seu nome?");
        String nome = scanner.nextLine();
        System.out.println("Qual a sua senha?");
        String senha = scanner.nextLine();
        if (this.EncontrarUsuarioeSenha(nome, senha)) {
            this.EncontrarUsuarioeSenha(nome, senha);
            System.out.println("Vc foi logado");
            this.executar();
        } else {
            System.out.println("Usuario não encontrado!");
        }

    }

    public boolean EncontrarUsuarioeSenha(String nome, String senha) {
        Iterator var3 = Usuarios.usuariosListados.iterator();

        Usuarios usuario;
        do {
            if (!var3.hasNext()) {
                return false;
            }

            usuario = (Usuarios)var3.next();
        } while(!nome.equals(usuario.nome) || !senha.equals(usuario.senha));

        this.conta = usuario.conta;
        return true;
    }

    public void executar() {
        this.continuarExecucao = true;

        while(this.continuarExecucao) {
            this.exibirMenu();
            int opcao = Integer.parseInt(scanner.nextLine());
            this.Menu(opcao);
        }

    }

    private void Menu(int opcao) {
        switch(opcao) {
            case 0:
                System.out.println("Obrigado pela preferencia");
                this.continuarExecucao = false;
                break;
            case 1:
                System.out.println("saldo:" + this.conta.getSaldo());
                break;
            case 2:
                System.out.println("Digite o valor:");
                double valordepositado = Double.parseDouble(scanner.nextLine());
                this.conta.depositar(valordepositado);
                break;
            case 3:
                System.out.println("Digite o valor:");
                double valorsacado = Double.parseDouble(scanner.nextLine());
                this.conta.sacar(valorsacado);
                break;
            case 4:
                System.out.println("Digite o valor que deseja trasnferir: ");
                String QRcode = this.conta.transformarQRcode(Double.parseDouble(scanner.nextLine()));
                System.out.println(QRcode);
                break;
            case 5:
                boolean isRegistered = false;
                Contas destino = null;

                String nome;
                while(!isRegistered) {
                    System.out.println("Digite o nome do destinatário:");
                    nome = scanner.nextLine();
                    Iterator var10 = Usuarios.usuariosListados.iterator();

                    while(var10.hasNext()) {
                        Usuarios usuario = (Usuarios)var10.next();
                        if (nome.equals(usuario.nome)) {
                            destino = usuario.conta;
                            isRegistered = true;
                            System.out.println("Usuário Encontrado!");
                        }
                    }

                    if (!isRegistered) {
                        System.out.println("Usuário não Encontrado! Tente novamente.");
                    }
                }

                System.out.println("Cole o QRcode gerado:");
                nome = scanner.nextLine();
                if (Transacoes.transferirDinheiro(destino, this.conta, nome)) {
                    Transacoes.transferirDinheiro(destino, this.conta, nome);
                    System.out.println("Valor transferido");
                } else {
                    System.out.println("Não foi possível transferir o valor");
                }
                break;
            default:
                System.out.println("Funcionalidade ainda não implementada");
        }

    }

    private void exibirMenu() {
        System.out.println("Bem vindo ao banco");
        System.out.println("1 - Visualizar Saldo");
        System.out.println("2 - Depositar dinheiro");
        System.out.println("3 - Sacar dinheiro");
        System.out.println("4 - Gerar QRcode (Necessário para transferir dinheiro)");
        System.out.println("5 - Transferir dinheiro");
        System.out.println("0 - Sair do sistema");
    }

    static {
        scanner = new Scanner(System.in);
    }
}
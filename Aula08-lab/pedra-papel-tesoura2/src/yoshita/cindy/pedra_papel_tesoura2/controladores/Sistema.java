package yoshita.cindy.pedra_papel_tesoura2.controladores;

import yoshita.cindy.pedra_papel_tesoura2.models.*;
import yoshita.cindy.pedra_papel_tesoura2.models.basinga.Lagarto;
import yoshita.cindy.pedra_papel_tesoura2.models.basinga.Spoke;
import yoshita.cindy.pedra_papel_tesoura2.models.classico.Papel;
import yoshita.cindy.pedra_papel_tesoura2.models.classico.Pedra;
import yoshita.cindy.pedra_papel_tesoura2.models.classico.Tesoura;

import java.util.Random;
import java.util.Scanner;

public class Sistema {
    private Jogador player1, player2;
    private Scanner scanner;
    private final Jogada[] jogadas = new Jogada[]{new Pedra(), new Papel(), new Tesoura(), new Lagarto(), new Spoke()};
    public Sistema(){
        scanner = new Scanner(System.in);
        inicializarJogadores();
    }
    public void run(){
        boolean continuar = true;
        do{
            System.out.println(player1.getNome() + " vs "+player2.getNome());
            player1.setJogada(escolheJogada());
            player2.setJogada(sortearJogada());
            System.out.println("Jogada Player 1:" + player1.getJogada());
            System.out.println("Jogada Player 2:" + player2.getJogada());
            System.out.println("Resultado:" + player1.getJogada().verificarResultado(player2.getJogada()));
        }while(continuar);
    }

    private Jogada escolheJogada() {
        int escolha;
        System.out.println("Escolha:");
        for (int i = 0; i < jogadas.length; i++) {
            System.out.println("" + i + " - " + jogadas[i]);
        }
        escolha = scanner.nextInt();
        return jogadas[escolha];
    }

    private Jogada sortearJogada() {
        return jogadas[new Random().nextInt(jogadas.length)];
    }

    private void inicializarJogadores() {
        System.out.println("Informe um nome para o jogador 1:");
        String nome = scanner.next();
        this.player1 = new Jogador(nome, true);
        this.player2 = new Jogador("NPC");
    }
}

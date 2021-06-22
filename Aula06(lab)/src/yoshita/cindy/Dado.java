package yoshita.cindy;

import java.util.Random;

public class Dado {
    private int numeroFaces;
    private int faceAtual;
    private int[] FACES;

    public Dado(int numeroFaces){
        this.numeroFaces = numeroFaces; // Nesse caso está afirmando que o this.numeroFaces é o int de dados q foi sorteado e n o da função
        this.FACES = new int[this.numeroFaces];
        for (int i = 0; i < this.numeroFaces; i++) {
            FACES[i] = i + 1;
        }
        sortearNumero();
    }

    public int sortearNumero(){
        Random random = new Random (); // new chama o construtor da classe e devolve ele
        this.faceAtual = random.nextInt(this.numeroFaces); // Retorna o valor do número inteiro que satisfaz Random no limite de numeroFaces
        return FACES[this.faceAtual];
    }

    public int pegarFaceAtual(){
        return FACES[this.faceAtual];
    }
}


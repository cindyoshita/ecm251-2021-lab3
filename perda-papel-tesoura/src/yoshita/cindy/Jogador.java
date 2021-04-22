package yoshita.cindy;

public class Jogador {

    private String nome;
    private boolean ehHumano;
    private Jogada jogada

}

public Jogador(String nome){
    this.nome = nome ;
    this.ehHumano = false;
}

    public String getNome() {
        return nome;
    }

    public boolean isEhHumano() {
        return ehHumano;
    }
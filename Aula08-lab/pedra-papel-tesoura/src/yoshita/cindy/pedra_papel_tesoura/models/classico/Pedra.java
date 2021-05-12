package yoshita.cindy.pedra_papel_tesoura.models.classico;

import yoshita.cindy.pedra_papel_tesoura.models.Jogada;

public class Pedra extends Jogada {

    @Override
    public boolean verificarSeGanhei(Jogada jogada) {
        return jogada instanceof Tesoura;
    }

    @Override
    public boolean verificarSePerdi(Jogada jogada) {
        return jogada instanceof Papel;
    }

    @Override
    public String toString() {
        return "Pedra";
    }
}

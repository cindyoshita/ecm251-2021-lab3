package yoshita.cindy.pedra_papel_tesoura.models.basinga;

import yoshita.cindy.pedra_papel_tesoura.models.Jogada;

import yoshita.cindy.pedra_papel_tesoura.models.classico.Papel;
import yoshita.cindy.pedra_papel_tesoura.models.classico.Pedra;
import yoshita.cindy.pedra_papel_tesoura.models.classico.Tesoura;

public class Lagarto extends Jogada {

    @Override
    public boolean verificarSeGanhei(Jogada jogada) {

        return (jogada instanceof Papel) || (jogada instanceof Spoke);
    }

    @Override
    public boolean verificarSePerdi(Jogada jogada) {

        return (jogada instanceof Pedra) || (jogada instanceof Tesoura);
    }

    @Override
    public String toString() {
        return "Lagarto";
    }
}

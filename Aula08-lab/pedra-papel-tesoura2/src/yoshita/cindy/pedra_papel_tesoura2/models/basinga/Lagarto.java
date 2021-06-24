package yoshita.cindy.pedra_papel_tesoura2.models.basinga;

import yoshita.cindy.pedra_papel_tesoura2.models.Jogada;

import yoshita.cindy.pedra_papel_tesoura2.models.classico.Papel;
import yoshita.cindy.pedra_papel_tesoura2.models.classico.Pedra;
import yoshita.cindy.pedra_papel_tesoura2.models.classico.Tesoura;

public class Lagarto extends Jogada {

    @Override
    public Jogada[] jogadasQueGanho() {
        return new Jogada[]{new Papel(), new Spoke()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[]{new Pedra(), new Tesoura()};
    }


    @Override
    public String toString() {
        return "Lagarto";
    }
}

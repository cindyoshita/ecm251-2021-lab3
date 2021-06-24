package yoshita.cindy.pedra_papel_tesoura2.models.basinga;

import yoshita.cindy.pedra_papel_tesoura2.models.Jogada;
import yoshita.cindy.pedra_papel_tesoura2.models.classico.Papel;
import yoshita.cindy.pedra_papel_tesoura2.models.classico.Pedra;
import yoshita.cindy.pedra_papel_tesoura2.models.classico.Tesoura;

public class Spoke extends Jogada {

    @Override
    public Jogada[] jogadasQueGanho() {
        return new Jogada[]{new Pedra(), new Tesoura()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[]{new Lagarto(), new Papel()};
    }

    @Override
    public String toString() {
        return "Spoke";
    }
}

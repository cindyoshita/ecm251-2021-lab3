package yoshita.cindy.pedra_papel_tesoura2.models.classico;

import yoshita.cindy.pedra_papel_tesoura2.models.Jogada;
import yoshita.cindy.pedra_papel_tesoura2.models.basinga.Lagarto;
import yoshita.cindy.pedra_papel_tesoura2.models.basinga.Spoke;
import yoshita.cindy.pedra_papel_tesoura2.models.classico.Papel;
import yoshita.cindy.pedra_papel_tesoura2.models.classico.Pedra;

public class Tesoura extends Jogada {

    @Override
    public Jogada[] jogadasQueGanho() {
        return new Jogada[]{new Lagarto(), new Papel()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[]{new Pedra(), new Spoke()};
    }

    @Override
    public String toString() {
        return "Tesoura";
    }
}

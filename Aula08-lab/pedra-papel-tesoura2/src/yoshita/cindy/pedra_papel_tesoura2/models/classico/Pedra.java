package yoshita.cindy.pedra_papel_tesoura2.models.classico;

import yoshita.cindy.pedra_papel_tesoura2.models.Jogada;
import yoshita.cindy.pedra_papel_tesoura2.models.basinga.Lagarto;
import yoshita.cindy.pedra_papel_tesoura2.models.basinga.Spoke;

public class Pedra extends Jogada {

    @Override
    public Jogada[] jogadasQueGanho() {
        return new Jogada[]{new Lagarto(), new Tesoura()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[]{new Papel(), new Spoke()};
    }

    @Override
    public String toString() {
        return "Pedra";
    }
}

package yoshita.cindy.pedra_papel_tesoura2.models.classico;

import yoshita.cindy.pedra_papel_tesoura2.models.Jogada;
import yoshita.cindy.pedra_papel_tesoura2.models.basinga.Lagarto;
import yoshita.cindy.pedra_papel_tesoura2.models.basinga.Spoke;

public class Papel extends Jogada {
    @Override
    public Jogada[] jogadasQueGanho() {
        return new Jogada[]{new Pedra(), new Spoke()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[]{new Tesoura(), new Lagarto()};
    }


    @Override
    public String toString() {

        return "Papel";
    }
}

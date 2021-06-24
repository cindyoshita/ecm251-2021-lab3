package yoshita.cindy.pedra_papel_tesoura.models.classico;

import yoshita.cindy.pedra_papel_tesoura.models.Jogada;
import yoshita.cindy.pedra_papel_tesoura.models.basinga.Lagarto;
import yoshita.cindy.pedra_papel_tesoura.models.basinga.Spoke;

public class Papel extends Jogada {

    @Override
    public boolean verificarSeGanhei(Jogada jogada) {

        return (jogada instanceof Pedra) || (jogada instanceof Spoke);
    }

    @Override
    public boolean verificarSePerdi(Jogada jogada) {

        return (jogada instanceof Tesoura) || (jogada instanceof Lagarto);
    }

    @Override
    public String toString() {

        return "Papel";
    }
}

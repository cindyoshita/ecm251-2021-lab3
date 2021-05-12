package yoshita.cindy.pedra_papel_tesoura.models.basinga;

import yoshita.cindy.pedra_papel_tesoura.models.Jogada;
import yoshita.cindy.pedra_papel_tesoura.models.classico.Papel;
import yoshita.cindy.pedra_papel_tesoura.models.classico.Pedra;

public class lagarto extends Jogada {

    @Override
    public boolean verificarSeGanhei(Jogada jogada) {
        return jogada instanceof Papel;
    }

    @Override
    public boolean verificarSePerdi(Jogada jogada) {
        return jogada instanceof Pedra;
    }

    @Override
    public String toString() {
        return "Lagarto";
    }
}

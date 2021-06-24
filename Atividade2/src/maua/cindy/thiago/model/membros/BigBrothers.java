package maua.cindy.thiago.model.membros;

import maua.cindy.thiago.enumeracoes.TipoHorario;
import maua.cindy.thiago.model.Membro;



public class BigBrothers extends Membro {
    @Override
    public void MensagemRegular() {
        System.out.println("Sempre ajudando as pessoas membros ou não S2!");;
    }

    @Override
    public void MensagemExtra() {
        System.out.println("...");;
    }

}

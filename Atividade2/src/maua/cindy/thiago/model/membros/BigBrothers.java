package maua.cindy.thiago.model.membros;

import maua.cindy.thiago.enumeracoes.TipoHorario;
import maua.cindy.thiago.model.Membro;
import maua.cindy.thiago.sistema.metodos.MudarHorario;


public class BigBrothers extends Membro {
    @Override
    public void mensagemRegular() {
        System.out.println("Sempre ajudando as pessoas membros ou não S2!");
        ;
    }

    @Override
    public void mensagemExtra() {
        System.out.println("...");
        ;
    }

}

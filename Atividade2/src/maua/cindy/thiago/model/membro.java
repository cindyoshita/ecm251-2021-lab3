package maua.cindy.thiago.model;


import maua.cindy.thiago.enumeracoes.TipoHorario;
import maua.cindy.thiago.sistema.metodos.MudarHorario;

import java.util.Scanner;

public abstract class Membro implements PostarMensagem,Apresentacao {

    public void horariomembro(){
        MudarHorario mh = new MudarHorario();
         if(TipoHorario.REGULAR == mh.mudarHorario(mh.scanner()))
            MensagemRegular();
        else if(TipoHorario.EXTRA == mh.mudarHorario(mh.scanner()))
            MensagemExtra();

    }

    public abstract void MensagemRegular();
    public abstract void MensagemExtra();

}

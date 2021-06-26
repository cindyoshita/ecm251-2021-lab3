package maua.cindy.thiago.model;


import maua.cindy.thiago.enumeracoes.TipoHorario;

public abstract class Membro implements PostarMensagem {


    public void comparar(TipoHorario a) {

        if (TipoHorario.REGULAR == a)
            this.mensagemRegular();
        else if (TipoHorario.EXTRA == a) {
            this.mensagemExtra();
        }
    }

}




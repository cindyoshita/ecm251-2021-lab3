package maua.cindy.thiago.model;


import maua.cindy.thiago.enumeracoes.TipoHorario;
import maua.cindy.thiago.model.membros.HeavyLifters;
import maua.cindy.thiago.sistema.metodos.MudarHorario;

public abstract class Membro implements PostarMensagem,Apresentacao {


    public void comparar(TipoHorario a){
        if(TipoHorario.REGULAR == a)
            mensagemRegular();
        else if(TipoHorario.EXTRA == a){
            mensagemExtra();
        }
    }

    public abstract void mensagemRegular();
    public abstract void mensagemExtra();

    }




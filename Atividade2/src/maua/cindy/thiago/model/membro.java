package maua.cindy.thiago.model;


import maua.cindy.thiago.enumeracoes.TipoHorario;

public abstract class Membro implements PostarMensagem,Apresentacao {

    public void Mensagem(){
        System.out.println("Mensagem para cada tipo de membro");

    }
    public String Horario(TipoHorario horario){
        if(horario == TipoHorario.REGULAR){
            return "Mensagem";
        }if(horario == TipoHorario.EXTRA){
            return "Extra";
        }return "Não tem mensagem";

    }

}

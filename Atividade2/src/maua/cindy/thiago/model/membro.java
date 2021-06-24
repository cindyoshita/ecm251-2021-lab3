package maua.cindy.thiago.model;


import maua.cindy.thiago.enumeracoes.TipoHorario;

public abstract class Membro implements PostarMensagem,Apresentacao {

    public void MensagemRegular(){
        System.out.println("Mensagem para cada tipo de membro regular");

    }
    public void MensagemExtra(){
        System.out.println("Mensagem para cada tipo de membro extra");

    }

    public void MembroRegular(){
        MensagemRegular();
    }


}

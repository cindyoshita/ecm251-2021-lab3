package maua.cindy.thiago.model;


import maua.cindy.thiago.enumeracoes.TipoHorario;

/**
 * Classe abstrata que implementa a interface PostarMensagem Membro, com o metodo comparar
 */
public abstract class Membro implements PostarMensagem {

    /**
     * Identifica qual é o parametro e dependendo do seu resultado, ira retornar um dos metodos da interface implementada
     * @param a Parametro do ENUM TipoHorario
     */
    public void comparar(TipoHorario a) {

        if (TipoHorario.REGULAR == a)
            this.mensagemRegular();
        else if (TipoHorario.EXTRA == a) {
            this.mensagemExtra();
        }
    }

}




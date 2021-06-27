package maua.cindy.thiago.model.membros;

import maua.cindy.thiago.model.Membro;

/**
 * Sub classe de membro, o qual faz um polimorfismo dos metodos da interface postar mensagem
 */
public class MobileMembers extends Membro {
    @Override
    public void mensagemRegular() {
        System.out.println("Happy Coding!");;
    }

    @Override
    public void mensagemExtra() {
        System.out.println("Happy_C0d1ng. Maskers");;
    }
}

package maua.cindy.thiago.model.membros;

import maua.cindy.thiago.model.Membro;

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

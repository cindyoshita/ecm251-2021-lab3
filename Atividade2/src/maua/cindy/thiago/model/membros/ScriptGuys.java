package maua.cindy.thiago.model.membros;

import maua.cindy.thiago.model.Membro;

/**
 * Sub classe de membro, o qual faz um polimorfismo dos metodos da interface postar mensagem
 */
public class ScriptGuys extends Membro {
    @Override
    public void mensagemRegular() {
        System.out.println("Prazer em ajudar novos amigos de código!");;
    }

    @Override
    public void mensagemExtra() {
        System.out.println("“QU3Ro_S3us_r3curs0s.py");;
    }
}

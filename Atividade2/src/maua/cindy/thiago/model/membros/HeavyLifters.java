package maua.cindy.thiago.model.membros;

import maua.cindy.thiago.model.Membro;

/**
 * Sub classe de membro, o qual faz um polimorfismo dos metodos da interface postar mensagem
 */
public class HeavyLifters extends Membro {
    @Override
    public void mensagemRegular() {
        System.out.println("Podem contar conosco!");;
    }

    @Override
    public void mensagemExtra() {
        System.out.println("Extra");;
    }
}

package maua.cindy.thiago.sistema.metodos;

import maua.cindy.thiago.enumeracoes.TipoHorario;
import maua.cindy.thiago.enumeracoes.TipoMembros;
import maua.cindy.thiago.model.membros.BigBrothers;
import maua.cindy.thiago.model.membros.HeavyLifters;
import maua.cindy.thiago.model.membros.MobileMembers;
import maua.cindy.thiago.model.membros.ScriptGuys;
import maua.cindy.thiago.registro.Usuario;


public class Mensagem {

    /**
     *Verifica se há algum dos tipos BIGBROTHERS, HEAVYLIFTERS, MOBILEMEMBERS, SCRIPTGUYS no ArrayList usuarioListado
     * caso tenha, irá inicializar o método comparar especifico de cada membro
     * @param a parametro do tipo ENUM tipoHorario
     */
    public void mensagemParaTodos(TipoHorario a){
        BigBrothers bb = new BigBrothers();
        HeavyLifters hl = new HeavyLifters();
        MobileMembers mm = new MobileMembers();
        ScriptGuys sg = new ScriptGuys();


        for (Usuario usuario : Usuario.usuarioListado){
            if (usuario.tm == TipoMembros.BIGBROTHERS)
                bb.comparar(a);

            if (usuario.tm == TipoMembros.HEAVYLIFTERS)
                hl.comparar(a);

            if (usuario.tm == TipoMembros.MOBILEMEMBERS)
                mm.comparar(a);

            if (usuario.tm == TipoMembros.SCRIPTGUYS)
                sg.comparar(a);

        }
    }
}
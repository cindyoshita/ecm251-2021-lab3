package maua.cindy.thiago;

import maua.cindy.thiago.enumeracoes.TipoMembros;
import maua.cindy.thiago.model.membros.BigBrothers;
import maua.cindy.thiago.registro.Usuario;
import maua.cindy.thiago.sistema.Sistema;
import maua.cindy.thiago.sistema.metodos.MudarHorario;
import maua.cindy.thiago.sistema.metodos.RegistrarUsuario;

public class Main {

    public static void main(String[] args) {
        //Sistema ss = new Sistema();
        //ss.Menu();

        RegistrarUsuario registrar = new RegistrarUsuario();
        registrar.registro();

    }
}

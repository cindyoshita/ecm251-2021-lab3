package maua.cindy.thiago.sistema.metodos;

import maua.cindy.thiago.model.Apresentacao;
import maua.cindy.thiago.registro.Usuario;

/**
 * Sub Classe que implementa a interface Apresentacao
 */
public class ApresentarUsuario implements Apresentacao {
    public void apresentar() {
        System.out.println(Usuario.usuarioListado);
    }
}

package maua.cindy.thiago.registro;

import maua.cindy.thiago.enumeracoes.TipoMembros;

import java.util.ArrayList;

/**
 * Cria um ArrayList onde irá armazenar os elementos de seu construtor
 */
public class Usuario {
    public static ArrayList<Usuario> usuarioListado = new ArrayList<>();
    String nomeDeUsuario;
    public int iD;
    String eMail;
    public TipoMembros tm;

    public Usuario(String nomeDeUsuario, int iD, String eMail, TipoMembros tm) {
        this.nomeDeUsuario = nomeDeUsuario;
        this.iD = iD;
        this.eMail = eMail;
        this.tm = tm;

        Usuario.usuarioListado.add(this);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nomeDeUsuario='" + nomeDeUsuario + '\'' +
                "; iD=" + iD +
                "; eMail='" + eMail + '\'' +
                "; tm=" + tm +
                '}' +
                '\n';
    }
}

package yoshita.cindy;

import java.util.ArrayList;

public class Usuarios {
    public static ArrayList<Usuarios> usuariosListados = new ArrayList();
    public String nome;
    public String senha;
    public String email;
    public Contas conta;

    public Usuarios(String nome, String senha, String email, double saldo, int idConta) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.conta = new Contas(idConta, saldo, this);
        usuariosListados.add(this);
    }

    public String toString() {
        return "Usuarios{nome='" + this.nome + "', senha='" + this.senha + "', email='" + this.email + "', conta='" + this.conta + "'}";
    }
}

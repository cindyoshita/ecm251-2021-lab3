package yoshita.cindy;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Basico01 {
    public static void main(String[] args) {
        //Tipos primitivos
        int numero;
        float hp;
        double atk;//dobro da precisão do float (usa esse para número real
        boolean gigantamax;
        String nome; // nao e primitivo mas se comporta como um

        //Atribuição para as variáveis
        numero = 25;
        hp = 155.0f;
        atk = 255.0;
        gigantamax = true;
        nome = "Pikachu"; // Sempre aspas duplas para string

        //Exibe os valores das variáveis
        System.out.println("Nome:" + nome);
        System.out.println("gigantamax:" + gigantamax);
        System.out.println("HP:" + hp + " atk:" + atk);

        //colar código sem desformatar gist ou pastebin
    }

}

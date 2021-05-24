package yoshita.cindy.array_list_test_drive;

import yoshita.cindy.model.Conta;
import yoshita.cindy.model.Pessoa;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTesteDrive {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Albafica","123"));
        pessoas.add(new Pessoa("Dohko","002"));
        pessoas.add(new Pessoa("Athena","126"));
        pessoas.add(new Pessoa("Shion","001"));
        pessoas.addAll(
                Arrays.asList(
                    new Pessoa("Seiya", "598"),
                    new Pessoa("Hyoga","785")
                )
        );

        System.out.println("==========");
        System.out.println("Passa para o arrayList Pessoas");
        pessoas.forEach(pessoa -> System.out.println(pessoa));

        List<Conta> contas = new ArrayList<>();
        contas.add(new Conta(89));
        contas.add(new Conta());
        System.out.println("==========");
        System.out.println("Passa para o arrayList Conta");
        contas.forEach(conta -> System.out.println(conta));
    }
}

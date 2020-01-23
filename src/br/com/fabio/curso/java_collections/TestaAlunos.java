package br.com.fabio.curso.java_collections;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();
        alunos.add("Rodringo Turini");
        alunos.add("Alberto Sttepa");
        alunos.add("Nico Belick");
        alunos.add("Renan Turing");
        alunos.add("Adalberto Roberto");
        alunos.add("Mauricio Ariche");

        alunos.forEach(System.out::println);

        alunos.forEach(x -> System.out.println(x));



    }
}

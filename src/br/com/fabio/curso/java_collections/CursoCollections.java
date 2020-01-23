package br.com.fabio.curso.java_collections;

import java.util.ArrayList;
import java.util.Collections;


public class CursoCollections {

    public static void main(String[] args) {

        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe aula";
        String aula3 = "Trabalhando com cursos e sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        aulas.remove(0);

        System.out.println(aulas);

        aulas.forEach(x -> System.out.println("Aula: " + x));

        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é: " + primeiraAula);

        System.out.println(aulas);
        Collections.sort(aulas);
        System.out.println("Depois de Ordenado: " + aulas);

    }

}

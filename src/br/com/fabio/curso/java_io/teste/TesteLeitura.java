package br.com.fabio.curso.java_io.teste;

import java.io.*;
import java.util.Objects;

public class TesteLeitura {

    public static void main(String[] args) throws IOException {

        var fix = new FileInputStream("lorem.txt");
        InputStreamReader isr = new InputStreamReader(fix);

        BufferedReader br = new BufferedReader(isr);

        String linha  = br.readLine();

        while (Objects.nonNull(linha)) {
            System.out.println(linha);
            linha = br.readLine();
        }
        br.close();

    }
}

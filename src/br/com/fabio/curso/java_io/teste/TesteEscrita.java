package br.com.fabio.curso.java_io.teste;

import java.io.*;
import java.net.Socket;

public class TesteEscrita {

    public static void main(String[] args) throws IOException {

        OutputStream fos = new FileOutputStream("lorem2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter br = new BufferedWriter(osw);

        br.write("teajhssajngtefuabjkdasbnkdsa");
        br.newLine();
        br.write("dmjadkjoasd");


        br.close();

    }

}

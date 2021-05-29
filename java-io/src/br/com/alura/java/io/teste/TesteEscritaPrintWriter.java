package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintWriter {

	public static void main(String[] args) throws IOException {
		// Fluxo de saída:

		//PrintStream ps = new PrintStream("lorem2.txt");

		PrintWriter ps = new PrintWriter("lorem2.txt", "UTF-8");
		
		ps.println("Lorem Ipsum is simply dummy text of the printing and typesetting");
		ps.println();
		ps.println();
		ps.print("sdfbvcrfs");
		
		ps.close();
		
		System.out.println();
	}

}

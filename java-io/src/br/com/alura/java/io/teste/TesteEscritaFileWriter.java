package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		// Fluxo de saída:
		
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
//		forma mais reduzida de mostrar uma saída:
		//BufferedWriter permite uma legibilidade boa
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		bw.write("Lorem Ipsum is simply dummy text of the printing and typesetting");
		bw.newLine();
		bw.newLine();
		bw.write("lfslvl,bl lfsllfsl ");
		
		
		bw.close();
		
	}

}

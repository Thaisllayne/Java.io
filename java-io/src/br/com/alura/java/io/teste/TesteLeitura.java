package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		// Fluxo de entrada com arquivo:
		
		
		// pega o arquivo
		InputStream fis = new FileInputStream("lorem.txt");
		
		// transformar os bytes em caracteres
		Reader isr = new InputStreamReader(fis, "UTF-8");
		
		// junta os caracteres para formar a linha
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		
		// para rodar todas as linhas:
		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		
		

		
		br.close();
		
	}

}

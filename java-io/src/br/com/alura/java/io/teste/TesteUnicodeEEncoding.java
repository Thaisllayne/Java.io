package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String s = "ç";
		
		// para saber o n�mero do caractere:
		System.out.println(s.codePointAt(0));
		
		// Unicode padr�o no Windows:
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());
		
		byte[] bytes = s.getBytes("windows-1252");
		System.out.println(bytes.length + ", windows-1252");
		
		//para mostrar o caractere:
		String sNovo = new String(bytes, "windows-1252");
		System.out.println(sNovo);
		
		
		
		// outras tabelas:
		bytes = s.getBytes("UTF-16");
		System.out.println(bytes.length + ", UTF-16");
		
		bytes = s.getBytes("UTF-8");
		System.out.println(bytes.length + ", UTF-8");
		
		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.println(bytes.length + ", US-ASCII");
		
	}
	
}

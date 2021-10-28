package desafios;

import java.util.Scanner;

public class Desafio11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe uma palavra: ");
		String palavra = "";
		palavra = input.nextLine().trim().toUpperCase();
		int tamanhoPalavra =  palavra.length();
		
		for(int i = 0; i <= tamanhoPalavra; i++) {
			System.out.println(palavra.charAt(i));
			
		}
		
		input.close();

	}

}

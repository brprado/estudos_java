package desafios;

import java.util.Scanner;

public class Desafio08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Informe um número inteiro e veja se ele é primo: ");
		int numero = input.nextInt();
		int cont = 0;

		for (int i = 1; i <= numero; i++) {
			if(numero % i == 0)
				cont++;
		}
			if(cont == 2) {
				System.out.println("Este é um numero primo");
			}else {
				System.out.println("Este não é um número primo");
			}
		


		input.close();

	}

}

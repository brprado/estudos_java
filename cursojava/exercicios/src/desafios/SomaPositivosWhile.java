package desafios;

import java.util.Scanner;

public class Desafio10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		int somador = 0;
		System.out.print("informe numeros inteiros positivos e veja a sua soma."
				+ "\nse quiser sair informe um numero negativo\n");
		while(num >= 0) {
			System.out.println("-=-=-=-=-=");
			System.out.print("Escolha: ");
			num = input.nextInt();
			somador += num;
		} 
		System.out.println("Você encerrou programa");
		System.out.println("A soma dos numeros é " + somador);
		
		input.close();

	}

}

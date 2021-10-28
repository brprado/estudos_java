package desafios;

import java.util.Random;
import java.util.Scanner;

public class Desafio09 {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		int numAleatorio = aleatorio.nextInt(100);
		int tentativas = 10;

		System.out.println("Jogo de advinha. \nVoc� tem 10 tentativas para adivinhar"
				+ " um numero entre 0 e 100!");
		Scanner input = new Scanner(System.in);
		System.out.println(numAleatorio);
		
		while(tentativas <= 10) {
			System.out.println("-=-=-=-=-=-=-=-=-=-=-=");

			System.out.println("\nTENTATIVAS RESTANTES: " + tentativas+"\n");
			System.out.print("Eu acho que � o n�mero: ");
			int numeroEscolhido = input.nextInt();

			if(numeroEscolhido == numAleatorio) {
				System.out.println("Voce ganhou!!!!" + " era o n�mero "+ numAleatorio);
				break;
			
			}else {
				if (numeroEscolhido < numAleatorio) {
					System.out.println("O numero � maior...");
				}else {
					System.out.println("O n�mero � menor...");
				}
				tentativas--;
			}

		}
		input.close();

	}

}

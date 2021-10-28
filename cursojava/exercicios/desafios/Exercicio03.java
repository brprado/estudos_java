package desafios;

import java.util.Scanner;

public class Exercicio03 {
	//Peça um valor e informe-o elevado ao quadrado e ao cubo
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double valor, quadrado, cubo;
		
		System.out.println("Informe um valor e veja-o elevado ao quadrado e ao cubo: ");
		valor = input.nextDouble();
		
		quadrado = Math.pow(valor, 2);
		cubo = Math.pow(valor, 3);
		
		System.out.println("O valor informado fica " + quadrado + " elevado ao quadrado");
		System.out.println("O valor informado fica " + cubo + " elevado ao cubo");
		

	}

}

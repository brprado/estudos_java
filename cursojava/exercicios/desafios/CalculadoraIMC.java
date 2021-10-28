package desafios;

import java.util.Scanner;

public class CalculadoraIMC {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		float peso, altura, denAltura, imc;
		String nome;
		
		System.out.print("Olá! informe o seu nome: ");
		nome = input.nextLine();

		System.out.print("\n" + nome + ", informe o seu peso em quilogramas: ");
		peso = input.nextFloat();
		System.out.print("\n" + nome + ", informe a sua altura em metros: ");
		altura = input.nextFloat();
		
		denAltura = (float) Math.pow(altura, 2);
		imc = peso/denAltura;
		System.out.printf("O seu IMC é de %.2f", imc);
		
		
	}

}

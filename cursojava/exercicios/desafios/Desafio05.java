package desafios;

import java.util.Scanner;

public class Desafio05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num;

		System.out.print("informe um número entre 0 e 10 e veja se ele é par: ");
		num = input.nextDouble();
		input.close();

		if (num >= 0 && num <= 10) {
			if(num % 2 == 0) {
				System.out.println("Este número é par!");
			}else {
				System.out.println("Este número não é par!");
			}
		}else {
			System.out.println("NÚMERO INVÁLIDO");
		}

	}

}

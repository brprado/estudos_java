package desafios;

import java.util.Scanner;

public class Desafio05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num;

		System.out.print("informe um n�mero entre 0 e 10 e veja se ele � par: ");
		num = input.nextDouble();
		input.close();

		if (num >= 0 && num <= 10) {
			if(num % 2 == 0) {
				System.out.println("Este n�mero � par!");
			}else {
				System.out.println("Este n�mero n�o � par!");
			}
		}else {
			System.out.println("N�MERO INV�LIDO");
		}

	}

}

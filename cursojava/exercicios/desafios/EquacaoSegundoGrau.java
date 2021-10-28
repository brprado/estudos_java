package desafios;

import java.util.Scanner;

public class EquacaoSegundoGrau {

	public static void main(String[] args) {
		//ax2 + bx + c = 0)
		double a, b, c;
		double delta, baskharaX1, baskharaX2;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o valor de 'a': ");
		a = input.nextDouble();
		
		System.out.print("Informe o valor de 'b': ");
		b = input.nextDouble();
		
		System.out.print("Informe o valor de 'c': ");
		c = input.nextDouble();
		
		delta = (b * b) - (4 * a * c);
		baskharaX1 = (-b + Math.sqrt(delta)) / (2 * a);
		baskharaX2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		System.out.println("O valor de delta é " + delta);
		System.out.println("O valor de x' é " + baskharaX1);
		System.out.println("O valor de x'' é " + baskharaX2);
		
		input.close();
	}

}

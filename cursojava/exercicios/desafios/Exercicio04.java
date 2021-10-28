package desafios;

import java.util.Scanner;

public class Exercicio04 {
	//áreea = (b * h) / 2
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Double altura, base, area;
		
		System.out.print("Informe o valor da base do triângulo: ");
		base = input.nextDouble();
		
		System.out.print("Informe o valor da altura do triângulo: ");
		altura = input.nextDouble();
		
		area = (base * altura) / 2;
		
		System.out.printf("O valor da área deste triãngulo é %.2f", area);
		
		input.close();
	}

}

package desafios;

import java.util.Scanner;

public class Exercicio04 {
	//�reea = (b * h) / 2
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Double altura, base, area;
		
		System.out.print("Informe o valor da base do tri�ngulo: ");
		base = input.nextDouble();
		
		System.out.print("Informe o valor da altura do tri�ngulo: ");
		altura = input.nextDouble();
		
		area = (base * altura) / 2;
		
		System.out.printf("O valor da �rea deste tri�ngulo � %.2f", area);
		
		input.close();
	}

}

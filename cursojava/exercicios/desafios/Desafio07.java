package desafios;

import java.util.Scanner;

public class Desafio07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota: ");
		double nota01 = input.nextDouble();
		
		if(nota01 < 0 || nota01 > 10) {
			System.out.println("Informe valores entre 0 e 10");
		} else {
			System.out.println("Informe a segunda nota: ");
			double nota02 = input.nextDouble();
			
			if(nota02 < 0 || nota02 > 10) {
				System.out.println("Informe valores entre 0 e 10");
			}else {
				double media = (nota01 + nota02)/2;
				System.out.printf("A sua média foi %.2f", media );
			}
			
		}
		
		
		
		
		
		
		input.close();

	}

}

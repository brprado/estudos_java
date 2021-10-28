package fundamentos;

import java.util.Scanner;

public class Exercicio01 {
	
	//(32 °F − 32) × 5/9

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double celsius = 0, fahr;
		System.out.println("CONVERSOR F° -> C°\n");
		
		System.out.print("Informe o valor em F°: ");
		fahr = input.nextDouble();
		
		celsius = (fahr - 32) * 5/9;
		
		System.out.println(fahr + " F° vale " + celsius + "C°");

		input.close();
	}

}

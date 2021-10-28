package desafios;

import java.util.Scanner;

public class Exercicio02 {
	//celsius -> fahrenheight
    //(c° * 9/5) + 32 = f°
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		double celsius, fahr;
		System.out.print("CONVERSOR C° -> F°\n");
		
		System.out.print("Informe o valor em graus celsius: C°");
		celsius = input.nextDouble();
		fahr = (celsius * 9/5) + 32;
		
		System.out.println(celsius + " C° vale " + fahr + "F°");
		
		input.close();
	}

}

package estruturascontrole;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe a média: ");
		double media = input.nextDouble();
		
		if(media >= 7.0){
			System.out.println("Aprovado");
			System.out.println("Parabéns");
		}else {
			System.out.println("Reprovado");
		}
			
		
		input.close();
	}

}

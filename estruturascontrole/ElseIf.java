package estruturascontrole;

import java.util.Scanner;

public class ElseIf {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a nota: ");
		double nota = input.nextDouble();
		
		if(nota > 10 || nota < 0) {
			System.out.print("Nota inválida");
		
		}else if(nota >= 8.1){
			System.out.println("conceito A");
		}else if(nota >= 6.1) {
			System.out.println("conceito B");
		}else if(nota >= 4.1) {
			System.out.println("conceito C");
		}else if(nota >= 2.1) {
			System.out.println("conceito D");
		}else {
			System.out.println("conceito E");
		}
		
		input.close();

	}

}

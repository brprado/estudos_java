package estruturascontrole;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		//do {instru��o/senten�a} while(...);
		Scanner input = new Scanner(System.in);

		String txt = "";


		do {
			System.out.println("Voce precisa falar "
					+ "as palavras m�gicas...");
			System.out.println("Quer sair? ");
			txt = input.nextLine();
		}while(!txt.equalsIgnoreCase("por favor")); //executa pelo menos uma vez, pois verifica s� depois

		System.out.println("t�, pode sair! kkk");
		input.close();
	}

}

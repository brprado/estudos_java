package estruturascontrole;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		//do {instrução/sentença} while(...);
		Scanner input = new Scanner(System.in);

		String txt = "";


		do {
			System.out.println("Voce precisa falar "
					+ "as palavras mágicas...");
			System.out.println("Quer sair? ");
			txt = input.nextLine();
		}while(!txt.equalsIgnoreCase("por favor")); //executa pelo menos uma vez, pois verifica só depois

		System.out.println("tá, pode sair! kkk");
		input.close();
	}

}

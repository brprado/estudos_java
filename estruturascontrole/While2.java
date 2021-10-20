package estruturascontrole;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String falar = "";
		int cont = 0;
		falar.equalsIgnoreCase("sair"); //se for true = sair do loop
		
		while(!falar.equalsIgnoreCase("sair")) {	
			System.out.print("Você diz: ");
			falar = input.nextLine().toLowerCase().trim();
			cont++;
			
			if (falar.equalsIgnoreCase("sair".toLowerCase().trim()))
			cont--;
		}
		System.out.println("Voce digitou " + cont + " palavra(s)!");
		input.close();
	}

}

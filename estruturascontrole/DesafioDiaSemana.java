package estruturascontrole;

import java.util.Scanner;

public class DesafioDiaSemana {
/*domingo = 1
 * segunda =2
 * terça =  3
 * quarta = 4
 * quinta = 5
 * sexta  = 6
 * sabado = 7
 * */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Infome o nome do dia da semana e "
				+ "\nveja qual o número correspondente\n");
		System.out.println("escreva desta meneira: \n[Segunda][Terça][Quarta][Quinta][Sexta][Sábado][Domingo]");
		
		System.out.print("Dia escolhido: ");
		String escolha = input.next().trim();
		
		if(escolha.equals("domingo")) {
			System.out.println("Este dia da semana corresponde ao numero 1");
			
		}else if(escolha.equalsIgnoreCase("segunda")) {
			System.out.println("Este dia da semana corresponde ao número 2");
		
		}else if(escolha.equalsIgnoreCase("terca")
				|| escolha.equalsIgnoreCase("terça")) {
			System.out.println("Este dia da semana corresponde ao número 3");
		
		}else if(escolha.equalsIgnoreCase("quarta")) {
			System.out.println("Este dia da semana corresponde ao número 4");
		
		}else if(escolha.equalsIgnoreCase("quinta")) {
			System.out.println("Este dia da semana corresponde ao número 5");
		
		}else if(escolha.equalsIgnoreCase("sexta")) {
			System.out.println("Este dia da semana corresponde ao número 6");
		
		}else if(escolha.equalsIgnoreCase("sabado")
				|| escolha.equalsIgnoreCase("sábado")) {
			System.out.println("Este dia da semana corresponde ao número 7");	
	
		}else {
			System.out.println("Este dia da semana não existe ou você digitou errado "
					+ "\nTente Novamente!");
		}
		input.close();

	}

}

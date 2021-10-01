package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print("Dia");
		
		System.out.println("Bom");
		System.out.println("dia");
		
		System.out.printf("MEGASENA: %d %d %d %d %d %d %n",
				1, 2, 3, 4, 5, 6);
		
		//CRIANDO SCANNER (INPUT)
		
		Scanner input = new Scanner(System.in); //system in = entrada de dados & system out = saida de dados
		
		//USANDO O SCANNER PARA CAPTURAR DADOS
		
		System.out.print("Digite o seu nome: ");
		String nome = input.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = input.nextLine();
		
		System.out.print("Digite a sua idade: ");
		int idade = input.nextInt();
		
		System.out.printf("%s %s tem %d anos",
				nome, sobrenome, idade);
		
		input.close();

	}

}

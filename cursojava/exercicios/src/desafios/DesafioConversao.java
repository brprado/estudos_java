package desafios;

import java.util.Scanner;

public class DesafioConversao {

		public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o primeiro sal�rio: R$"); //Pegando o valor em string
		String valor1 = input.nextLine().replace(",", "."); //para utilizar os metodos
		
		System.out.print("\nInforme o segundo sal�rio: R$");
		String valor2 = input.nextLine().replace(",", ".");

		
		System.out.print("\nInforme o terceiro sal�rio: R$");
		String valor3 = input.nextLine().replace(",", ".");

		double salario1 = Double.parseDouble(valor1); //criando uma nova var p convers�o
		double salario2 = Double.parseDouble(valor2); //convertendo str -> double
		double salario3 = Double.parseDouble(valor3);
		
		double media =  (salario1 + salario2 + salario3) / 3;
		
		System.out.printf("A m�dia dos sal�rios � R$" + media);
		input.close();
    
    
	}

}

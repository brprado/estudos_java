package desafios;

import java.util.Scanner;

public class Desafio12 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("MAIOR E MENOR ENTRE 10 NUMEROS INFORMADOS\n\n");
		int cont = 0;
		int valor = 0;
		int maiorValor = 0;
		do {
			System.out.println("INFORME O VALOR: ");
		    valor = input.nextInt();
		    if(valor > maiorValor) {
		    	maiorValor = valor;
		    }
		    cont++;
	
		}while(cont != 10);
		System.out.println("O maior valor é " + maiorValor);
		input.close();
		
	}
}

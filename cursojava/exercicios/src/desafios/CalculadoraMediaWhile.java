package estruturascontrole;

import java.util.Scanner;

public class DesafioWhile {
	//MEDIA DE NOTAS USANDO WHILE (PARA SAIR = "-1")
	//PASSOS
	/*
	 * CRIAR ACUMULADOR
	 * CRIAR CONTADOR
	 * ABRIR LOOP COM WHILE (CONDIÇÃO  NOTA 0 A 10)*/
	public static void main(String[] args) {
		double notaTotal = 0.0; //acumulador
		double nota = 0.0;
		int cont = 0; //contador

		Scanner input = new Scanner(System.in);

		System.out.println("-=-=-=-= CALCULADORA DE MÉDIA ARITMÉTICA C/ WHILE -=-=-=-=");
		while (nota != -1.0) {
			System.out.print("\nInforme a nota ou digite -1 para sair: ");
			nota = input.nextDouble();
			if (nota >= 0 && nota <= 10 || nota == -1) {
				if (nota != -1) {
					cont++;
					notaTotal += nota;

				}else {
					System.out.printf("\nA média aritmética destas %d notas é %.2f",cont, notaTotal / cont);
				}
			}else {
				System.out.print("Digite somente valores de 0 a 10. Tente outro número\n");
			}
		}
		input.close();
	}
}

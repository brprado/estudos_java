package estruturascontrole;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String conceito = "";
		System.out.println("Informe a sua nota");
		int nota = input.nextInt();

		switch (nota) {
		case 10: case 9: //quando dois cases têm o mesmo resultado
			conceito = " = A";
			break;
		case 8:
		case 7:
			conceito = " = B";
			break;
		case 6:
		case 5:
			conceito = " = C";
			break;
		//pode organizar assim também:
		case 4: case 3:
			conceito = " = D";
			break;
		case 2: case 1: case 0:
			conceito = " = E";
			break;
		default:
			conceito = " = não informado";
			break;
		}
		System.out.println("O conceito é " + conceito);
		input.close();	
	}

}

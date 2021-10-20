package estruturascontrole;

import javax.swing.JOptionPane;

public class Else {

	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog(
				"Informe o número");
		int numero = Integer.parseInt(valor); //str -> int
		
		if (numero % 2 == 0) {
			System.out.println("Numero par"); //true block
		}else {
			System.out.println("Número ímpar"); //false block
		}

	}

}

package desafios;

import java.util.Calendar;

public class Desafio06 {
	int dataAno;
	public static void main(String[] args) {
		int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
		System.out.println("["+anoAtual + "]");
		
		if (anoAtual % 100 == 0 && anoAtual % 400 == 0) {
			System.out.println("Este um ano bissexto");
		}else {
			System.out.println("Este não é um ano bissexto");
		}
	}

}

package fundamentos.operadores;

import java.util.Scanner;

public class ComparandoStrings {

	public static void main(String[] args) {
		
		//compare strings utilizando> String.equals(str a ser comparada)
		
		String s1 = new String("2");
		System.out.println("2" == s1); //FALSE
		
		//Maneira correta
		
		System.out.println("2".equals(s1));
		
		Scanner input = new Scanner(System.in);
		String s2 = input.next().toString();
		System.out.println("2" == s2.trim());
		
		//OU
		
		System.out.println("2".equals(s2.trim())); //o trim retira os espaços em branco digitados pelo usuário
		
	}

}

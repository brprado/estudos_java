package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		String s = "Bom dia, X";
		s = s.replace("X", "SENHORA"); //substitui uma frase/string por outra
		s = s.concat(", tudo bem?"); //concatenação de strings
		s = s.toUpperCase(); //Joga tudo para maiúsculo
		
		System.out.println(s);
		
		System.out.println("Bruno"
				.toLowerCase()
				.concat("prado"));
		
		//ou
		
		String meuNome = "bruno prado"
				.toUpperCase()
				.replace("PRADO","CARVALHO");
		
		System.out.println(meuNome);
		
		//Tipos primitivos não têm operador "." / notação ponto
		/*
		 * int a = 3;
		 * a.??? (não existe método) */
	}

}

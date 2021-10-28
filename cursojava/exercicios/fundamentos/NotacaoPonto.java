package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		String s = "Bom dia, X";
		s = s.replace("X", "SENHORA"); //substitui uma frase/string por outra
		s = s.concat(", tudo bem?"); //concatena��o de strings
		s = s.toUpperCase(); //Joga tudo para mai�sculo
		
		System.out.println(s);
		
		System.out.println("Bruno"
				.toLowerCase()
				.concat("prado"));
		
		//ou
		
		String meuNome = "bruno prado"
				.toUpperCase()
				.replace("PRADO","CARVALHO");
		
		System.out.println(meuNome);
		
		//Tipos primitivos n�o t�m operador "." / nota��o ponto
		/*
		 * int a = 3;
		 * a.??? (n�o existe m�todo) */
	}

}

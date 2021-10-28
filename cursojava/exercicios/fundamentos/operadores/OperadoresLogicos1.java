package fundamentos.operadores;

public class OperadoresLogicos1 {
	 public static void main(String[] args) {
		 
		boolean condicao1 = true; //operador booleano
		boolean condicao2 = 3 > 7; //operador relacional
		
		
		// E, OU, XOR E NEGAÇÃO
		System.out.println(condicao1 && condicao2);  //AND
		System.out.println(condicao1 || condicao2);  //OR
		System.out.println(condicao1 ^ condicao2);   //XOR (so é true quando o resultado das condições forem diferentes)
		
		//NOT ou NEGAÇÃO
		System.out.println(!condicao1);
		System.out.println(!condicao2);
		
		//DUPLA NEGAÇÃO
		System.out.println(!!condicao1); //o valor retorna ao original
		
		//TABELA VERDADE 'AND'
		System.out.println("\nTABELA VERDADE 'E'\n");
		System.out.println(true && true);   //true
		System.out.println(true && false);  //false
//		System.out.println(false && true);  //false DEADCODE
//		System.out.println(false && false); //false DEADCODE
		
		//TABELA VERDADE 'OR'
		System.out.println("\nTABELA VERDADE 'OU'\n");
//		System.out.println(true || true);   //true  DEADCODE
//		System.out.println(true || false);  //true DEADCODE
		System.out.println(false || true);  //true
		System.out.println(false || false); //false
		
		//TABELA VERDADE 'XOR'
		System.out.println("\nTABELA VERDADE 'XOR / OU EXCLUSIVO'\n");
		System.out.println(true ^ true);   //false
		System.out.println(true ^ false);  //true
		System.out.println(false ^ true);  //true
		System.out.println(false ^ false); //false
		
		//TABELA VERDADE 'NOT'
		System.out.println("\nTABELA VERDADE 'XOR / OU EXCLUSIVO'\n");
		System.out.println(!true);  //false
		System.out.println(!false); //true
		
		
		
		


	}
	
			
}

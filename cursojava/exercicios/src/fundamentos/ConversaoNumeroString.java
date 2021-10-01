package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		
		Integer num1 = 10000; //wrapper class (possibilita utiliza��o de m�todos)
		System.out.println(num1.toString()); //int -> str
		
		System.out.println(num1.toString() + 20); //concatena��o, pois 10k = str
		
		System.out.println(num1.toString().length());
		
		//OU
		Integer num2 = 150;
		System.out.println(Integer.toString(num2)); //outra forma
		
		//OU concatenando com uma string vazia
		var strTeste = "" + 300;
		System.out.println(strTeste + 90); //concatenando p/ provar que � str
		
		//PODE UTILIZAR ESTES M�TODOS PARA QUALQUER TIPO PRIMITIVO
		
		//Long.toString(num);
		//Short.toString(num);
		//Double.toString
		//etc...
	}

}

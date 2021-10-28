package fundamentos;

public class Wrappers {

	public static void main(String[] args) {
		//byte
		Byte b = 100;
		
		//short
		Short s = 1000;
		System.out.println(s);
		
		//int
		Integer i = 10000;
		
		//convers�o str -> int
		Integer conv = Integer.parseInt("200");
		
		///long
		Long l = 100000L;
		System.out.println(l);
		
		//Boolean
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo.toString().toUpperCase());
		
		//Character (char)
		Character c = '#';
		c.toString();
		c.charValue();
		
		//Float
		Float f = 100.50F; //Deve colocar o F, pois o padr�o � o double
		System.out.println(f);
		//Double
		Double d = 123.456; //n�o precisa indicar o D, pois j� � padr�o
		System.out.println(d);
		
		//Tipo primitivo: int
		//Wrapper class: Integer
		
		//Agora podemos utilizar m�todos associados a essas wrapper classes
		//Que antes eram tipos primitivos, os quais n�o podem usar m�todos
		
		System.out.println(b.byteValue());
		System.out.println(i.toString());
		System.out.println(conv * 5); //testando a convers�o str -> int
		
	}

}

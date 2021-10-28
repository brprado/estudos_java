package fundamentos;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		System.out.println(2 + 3);
		
		var x = 3.456;
		double y = 6.6543;
		
		System.out.println(x + y);
		System.out.println(x - y);  
		System.out.println(x * y);  
		System.out.println(x / (double) y);  //casting

		//O RESULTADO DE OPERAÇÕES COM DOUBLE SERÁ IGUAL A DOUBLE
		
		System.out.println(8 % 3); //resto da divisão
		System.out.println(y % x);
	}

}

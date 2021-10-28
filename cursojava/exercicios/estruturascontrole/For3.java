package estruturascontrole;

public class For3 {
	/*
	 * a avariável 'i' não tem
	 * escopo externo quando
	 * declarada dentro do 'for', 
	 * exceto se for declarada fora 
	 * do mesmo, como no
	 * exemplo a seguir: */
	
	/*
	 * se declarar uma variavel 
	 * dentro do for, voce pode 
	 * declarar outra com o mesmo
	 *  nome fora da iteração*/
	
	public static void main(String[] args) {
		int i = 0;
		for (; i < 10; i++) { 
			System.out.println("i = " + i);
		}
		System.out.println("saiu do laço " + i);
	}

}

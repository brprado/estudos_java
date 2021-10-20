package estruturascontrole;

public class For {

	public static void main(String[] args) {
		// ESTRUTURA:
		// for (inicializar variável; expressão/condição ; incremento)
		
		for (int contador = 10; contador >= 0; contador--) {
			System.out.printf("i = %d\n", contador);
			
		}
		
		//não é obrigatório ter as três partes definidas dentro de um 'for'
		
		int x = 2; //declarou antes
		
		for (;x < 10;) {
			x ++; //incrementou depois
			System.out.println("X = " + x);
		}
		
		// laço infinito:  for(;;){   } 
	}

}

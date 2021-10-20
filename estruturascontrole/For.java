package estruturascontrole;

public class For {

	public static void main(String[] args) {
		// ESTRUTURA:
		// for (inicializar vari�vel; express�o/condi��o ; incremento)
		
		for (int contador = 10; contador >= 0; contador--) {
			System.out.printf("i = %d\n", contador);
			
		}
		
		//n�o � obrigat�rio ter as tr�s partes definidas dentro de um 'for'
		
		int x = 2; //declarou antes
		
		for (;x < 10;) {
			x ++; //incrementou depois
			System.out.println("X = " + x);
		}
		
		// la�o infinito:  for(;;){   } 
	}

}

package estruturascontrole;

public class AninhandoFor {
	
	public static void main(String[] args) {
		for (int a = 1; a <= 10; a++) {
			for (int b = 1; b <= 10; b++ ) {
				System.out.printf("\n%d x %d = %d", a, b, (a*b));
			}
			System.out.println("\n\n-=-=-=-=-=-="); //quebra linha quando esgota 'b'
			/*
			para cada valor de 'a' o 'b' 
			irá iterar completamente até se esgotar,
			e em seguida parte para a
			proxima iteração de 'a', que tambem
			esgota 'b' antes de passar para o proximo 'a'
			*/
		}
	}
}

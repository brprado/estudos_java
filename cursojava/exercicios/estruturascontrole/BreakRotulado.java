package estruturascontrole;

public class BreakRotulado {

	public static void main(String[] args) {
		externo: for (int i = 0; i < 3; i++) { //rotulando
			 for (int j = 0; j < 3; j++) {
				
				if(i == 1) {
					break externo; //quebra o la�o externo
				}
			System.out.printf("%d %d", i, j);
			}
			
		}
		

	}

}

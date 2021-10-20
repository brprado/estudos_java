package estruturascontrole;

public class ContinueRotulado {

	public static void main(String[] args) {
		externo: for (int i = 0; i < 3; i++) { //rotulando
			 for (int j = 0; j < 3; j++) {
				if(i == 1) { 
					continue externo; //vai para a prox iteração e pula o 1
				}
			    System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}
		System.out.println("FIM");	
	}

}

package estruturascontrole;

public class Break {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			if(i == 5) {
				break; //quebra a itera��o
		}
			System.out.println(i);
		}
		System.out.println("Fim");//cai aqui
	}

}

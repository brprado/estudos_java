package revisoes;

public class ForLoop {
	
	public static void main(String[] args) {
		int valorPa = 2, razao = 6, limite = 100;
		
		//pa
		for(int i = 2; i <= 100; i+=6) {
			System.out.println(i + " ");

		}
		System.out.println("\n\n");
		
		//pg
		while(valorPa <= limite) {
			System.out.println(valorPa);
			valorPa *= razao;


		}
	}

}


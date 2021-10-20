package estruturascontrole;

public class While {
	//enquanto
	//o while repete o bloco até que a condição se torne falsa
	public static void main(String[] args) {
		
		int cont = 1; //contador
		String nome = "Bruno";
		
		while(cont <= 10) {
			System.out.printf("Bom dia %d %s\n", cont, nome);
			cont++; //incrementador do contador cont = cont + 1
		}

	}

}

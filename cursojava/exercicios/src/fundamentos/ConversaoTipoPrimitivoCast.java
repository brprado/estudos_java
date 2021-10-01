package fundamentos;

public class ConversaoTipoPrimitivoCast {

	public static void main(String[] args) {
		
		double a = 1;
		System.out.println(a); //outupt = 1.0
		
		//conv double -> float output: 1.324321
		float b = (float) 1.324321; //EXPLICITA: casting ou CAST
		System.out.println(b);

		//double aceita mais casas deciamais do que o float
		
		//CONVERSÃO DE UM TIPO MAIOR PARA UM MENOR
		
		int c = 4;
		byte d = (byte) c; //deve fazer a conversão explicita com o CAST
		System.out.println(d);
		
		//double -> int
		
		double e = 1.99999;
		int f = (int) e;
		System.out.println(f); //ignora qualquer casa decimal
	}

}

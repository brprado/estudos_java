package desafios;

public class Exercicio01 {
	/*
	 * Fahrenheight --> Celsius
	 * (F° - 32) * 5/9 = C°
	 */
	
	public static void main(String[] args) {
		double fah = 50;
		final double FASUB = 32; //contantes em letras maiúsculas
		final double FAMULT = 5.0/9;
		double cel = ((fah - FASUB) * FAMULT);
		
		System.out.println(fah + "°F = " + cel + "°C");
		

	}
}

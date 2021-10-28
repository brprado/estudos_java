package classe;

public class AreaCircTest {

	public static void main(String[] args) {
		AreaCirc a1 = new AreaCirc(5.6); //construtor explicito

		System.out.println("A área da circunferência de raio "+ a1.raio + " é " + a1.area());
		System.out.println(AreaCirc.PI); //podemos acessar diretamente da classe, pois está usando STATIC

		AreaCirc a2 = new AreaCirc(); //construtor padrão explicito
		System.out.println("A área é: " + AreaCirc.area(10));
		a2.area();
		
	}
}


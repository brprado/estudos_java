package classe;

public class AreaCircTest {

	public static void main(String[] args) {
		AreaCirc a1 = new AreaCirc(5.6); //construtor explicito

		System.out.println("A �rea da circunfer�ncia de raio "+ a1.raio + " � " + a1.area());
		System.out.println(AreaCirc.PI); //podemos acessar diretamente da classe, pois est� usando STATIC

		AreaCirc a2 = new AreaCirc(); //construtor padr�o explicito
		System.out.println("A �rea �: " + AreaCirc.area(10));
		a2.area();
		
	}
}


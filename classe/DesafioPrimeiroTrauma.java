package classe;

public class DesafioPrimeiroTrauma {
	int a = 3;
	String olaMundo = "Ol�, mundo";
	static int b = 100;

	public static void main(String[] args) {
		
		DesafioPrimeiroTrauma teste = new DesafioPrimeiroTrauma(); //instanciando objeto do tipo "DesafioPrimeiroTrauma"
		System.out.println(teste.a);
		System.out.println(teste.olaMundo); //atributo de inst�ncia (s/ static)
		System.out.println(b);//static = atributo de classe (n precisa criar inst�ncia)

	}

}

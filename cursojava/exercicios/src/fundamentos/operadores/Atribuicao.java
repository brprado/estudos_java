package fundamentos.operadores;

public class Atribuicao {

	public static void main(String[] args) {
		
		int a = 3; //atribui��o
		int b = a;
		int c = a + b;
		
		c += b; // c = c + b
		c -= a; // c = c - a
		c *= b; // c = c * b
		c /= a; // c = c / a
		c %= 2; // c = c % 2  | 0 ou 1 (0 = par, 1 = impar)
		
		//Operador un�rio
		c++; // c = c + 1 //incremento
		c--; // c = c - 1 //decremento
		

	}

}

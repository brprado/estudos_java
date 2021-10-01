package fundamentos.operadores;

public class OperadoresUnarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b= 2;
		
		//VALE PARA QUALUQER TIPO PRIMITIVO NUMERICO
		a++; // a = a + 1
		a--; // a =a - 1
		
		//OR
		
		++b; // b = b + 1
		--b; // b = b + 1
		
		System.out.println(++a == b--); //= true, pois o ++ prefix incrementa antes de comparar
		//enquanto o b (-- posfix) compara antes de decrementar

	}

}

package estruturascontrole;


public class Continue {

	public static void main(String[] args) {
		//o 'continue' interrompe uma repeti��o e vai para a pr�xima
		
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) { // quando for impar ele continua iterando, caso contr�rio, ele cai na linha 15
				continue; //faz continuar iterando
				
			}
			System.out.println(i);//se n�o for impar cai aqui
		}
		System.out.println("--------ex02-------");
		System.out.println("\n\n-------------------\n\n");
		//outro exemplo
		
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				System.out.println("x"); //aqui ele cortar� o cinco na itera��o, pois n�o pula para a outra instru��o da itera��o
				continue; //...por conta do continue
				
			}
			System.out.println(i); //imprime os valores que forem != 5
		}
	}

}

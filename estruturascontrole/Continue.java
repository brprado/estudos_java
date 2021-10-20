package estruturascontrole;


public class Continue {

	public static void main(String[] args) {
		//o 'continue' interrompe uma repetição e vai para a próxima
		
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) { // quando for impar ele continua iterando, caso contrário, ele cai na linha 15
				continue; //faz continuar iterando
				
			}
			System.out.println(i);//se não for impar cai aqui
		}
		System.out.println("--------ex02-------");
		System.out.println("\n\n-------------------\n\n");
		//outro exemplo
		
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				System.out.println("x"); //aqui ele cortará o cinco na iteração, pois não pula para a outra instrução da iteração
				continue; //...por conta do continue
				
			}
			System.out.println(i); //imprime os valores que forem != 5
		}
	}

}

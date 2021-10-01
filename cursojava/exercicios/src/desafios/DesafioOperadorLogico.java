package desafios;

public class DesafioOperadorLogico {

	public static void main(String[] args) {
		//Trabalho na terça (V ou F)
		//Trabalho na quinta (V ou F)
		//Se um trab der certo = tv 32 + sorvete
		//se dois trab der certo = tv de 50 + sorvete
		//Se nenhum trab der certo = ficar em casa
		boolean trab1 = false;
		boolean trab2 = false;
		
		if (trab1 && trab2) {
			System.out.println("Consegui os dois trabalhos\nvamos tomar sorvete e comprar uma tv de 50 polegadas");
		}else if (trab1 || trab2) {
			System.out.println("Consegui um trabalho\nvamos comprar a tv de 32 polegadas e vamos tomar um sorvete!");
		}else {
			System.out.println("Não vai rolar. estou sem trabalho e sem grana");
		}
		System.out.println("\n");
		
		if (trab1 == false && trab2 == false) {
			boolean comprouNada = true;
			System.out.println("comprou nada? " + comprouNada);
		}else {
			boolean comprouNada = false;
			System.out.println("comprou nada? " + comprouNada);
		}
		
		boolean tvDe50 = trab1 && trab2;
		System.out.println("comprou tv de 50\"? " + tvDe50);
		
		boolean tvDe25 = trab1 ^ trab2; //XOR só é true se for v + f ou f + v
		System.out.println("comprou tv de 25\"? " + tvDe25);
		
		boolean sorvete = trab1 || trab2;
		System.out.println("comprou sorvete? " + sorvete);

		System.out.println("Mais saudável? " + !sorvete);
	}

}

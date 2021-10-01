package fundamentos.operadores;

public class OperadoresTernarios {

	public static void main(String[] args) {
		
		double media = 5.0;
		String recuperao = media >= 5 ? "EM RECUPERAÇÃO" : "REPROVADO";
		String resultado = media >= 7 ? "APROVADO!" : recuperao; //estrutura condicial
		
		//estrutura: condição ? "bloco true" : "bloco false";
		
		System.out.println("O aluno está " + resultado);
		
		System.out.println("\nEXEMPLO\n");
		
		double nota = 4.0;
		
		System.out.println("Nota: " + nota);
		
		boolean bomComportamento = true;
		String bemComportado = bomComportamento ? "Aluno exemplar" : "Pode melhorar";
		System.out.println("comportamento: " + bemComportado);
		
		boolean passouMedia = nota >= 7;
		String atingiuMedia = passouMedia ? "O aluno passou com média " : "O aluno não passou com a media: ";
		System.out.println("Atingiu a média? " + atingiuMedia + " " + nota);
		
		
		
		boolean temDesconto = passouMedia && bomComportamento;
		String resultado = temDesconto ? "Sim" : "Não";
		System.out.println("Tem desconto? " + resultado);

	}

}

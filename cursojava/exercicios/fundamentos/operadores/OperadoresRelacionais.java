package fundamentos.operadores;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		
		System.out.println (a == b); //igual a
		System.out.println(3 > 7);   //maior que
		System.out.println(7 < 3);   //menor que
		System.out.println(30 != 7); //diferente de
		
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

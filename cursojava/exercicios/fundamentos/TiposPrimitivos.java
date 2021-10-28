package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		//TIPOS NUM�RICOS INTEIROS
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;   
		int id = 13245;
		long pontosAcumulados = 3_234_845_223L; 
		//A diferen�a destes tipos � somente a capacidade de armazenamento
		//Os underlines s�o como os pontos nos numeros
		//No final dos numeros do tipo literal 'long', voc� deve colocar um 'L'
	
		//TIPOS NUM�RICOS REAIS
		
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_000_000_000.98; //declarnado double como literal n�o precisa reafirmar
		
		//Tipo booleano
		
		boolean estaDeFerias = false;
		boolean estaTrabalhando = true;
		
		//tipo caractere (o tipo char s� aceita um caractere)
		char statusOn = 'A'; //ativo
		char statusOff = 'I'; //inativo
		
		//Dias de empresa
		System.out.println("Este funcion�rio est� empregado h� " + anosDeEmpresa * 365 + ", que � igual a " + anosDeEmpresa + " anos");
		
		//Numero de viagens
		System.out.println("Numero de viagens: " + numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println("Dotes/R$: " + pontosAcumulados / vendasAcumuladas);
		System.out.println("Dotes acumulados: " + pontosAcumulados);

		
		System.out.println("ID: " + id);
		System.out.println("ganha -> R$" + salario);
		System.out.println("Est� de ferias: " + estaDeFerias);
		System.out.println("Est� trabalhando: " + estaTrabalhando);
		System.out.println(statusOn + "tivo");
		System.out.println(statusOff + ": em atividade");
		
	}

}

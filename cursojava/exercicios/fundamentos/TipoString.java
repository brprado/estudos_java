package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Ol�, pessoal".charAt(2)); 
		//charAt ir� mostrar qual caracter ocupa a determinada posi��o
		
		//Tipos primitivos n�o possuem nota��o ponto
		//lembre-se, String N�O � um TIPO PRIMITIVO
		
		String msg = "Boa noite";
		
		System.out.println(msg.toLowerCase().startsWith("boa")); //Opera��o booleana, verifica se inicia com a palavra "boa"
		System.out.println(msg.toLowerCase().endsWith("dia")); //termian com "STRING"
		System.out.println(msg.length());
		System.out.println(msg.equalsIgnoreCase("boa noite")); //desconsidera o CASE do texto
	
		var nome = "Bruno";
		var sobrenome = "Prado";
		var  idade = 20;
		var salario = 5_000.00;
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome); // \n = quebra de linhha
		System.out.println("Idade: " + idade + "\nSal�rio: " + salario );
		
		//OU
		System.out.println("\n\n"); //Pulando linhas
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f." //Usanod printf
				,nome, sobrenome, idade, salario); //tem que ser na sequencia dentro da string
		/*
		 * %s = strings
		 * %d = valores inteiros
		 * %f = valores float
		 * */
	
	}

}

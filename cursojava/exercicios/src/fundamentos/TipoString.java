package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá, pessoal".charAt(2)); 
		//charAt irá mostrar qual caracter ocupa a determinada posição
		
		//Tipos primitivos não possuem notação ponto
		//lembre-se, String NÃO é um TIPO PRIMITIVO
		
		String msg = "Boa noite";
		
		System.out.println(msg.toLowerCase().startsWith("boa")); //Operação booleana, verifica se inicia com a palavra "boa"
		System.out.println(msg.toLowerCase().endsWith("dia")); //termian com "STRING"
		System.out.println(msg.length());
		System.out.println(msg.equalsIgnoreCase("boa noite")); //desconsidera o CASE do texto
	
		var nome = "Bruno";
		var sobrenome = "Prado";
		var  idade = 20;
		var salario = 5_000.00;
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome); // \n = quebra de linhha
		System.out.println("Idade: " + idade + "\nSalário: " + salario );
		
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

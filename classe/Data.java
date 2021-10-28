package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	//metodo para formatar as datas
	String obterData(){
		String formatado = "%d/%d/%d"; //variável local
		return String.format(formatado, dia, mes, ano); //como se fosse um printf
		//retorna uma string formatada
	}
	
	//construtor padrão c/ valores default
	//Data(){
		//dia = 1;
		//mes = 1;
		//ano = 1970;
	//}
	
	// -----------THIS E THIS()-----------//
	
	Data(int dia, int mes, int ano){//parametros do metodo construtor
		this.dia = dia; 			//this = referenciar o objeto atual
		this.mes = mes;             //já cria o objeto com os dados passados no parametro do método construtor
		this.ano = ano;
	}
	
	static void teste() {
		//this.dia = 3;
		//sentença de código inválida, pois um metodo estático está assiciado a classe
		//this = somente em instancias
	}	
		//------construtor com THIS()-----//
	Data(){
		this(1, 2, 1990);
	}
	
		//----------VALORES PADRÃO----------//
	//byte, short, int long -> 0
	//float, double -> 0.0
	//boolean -> false
	//char -> \u0000' primeiro elemento da tabela unicode
	
}

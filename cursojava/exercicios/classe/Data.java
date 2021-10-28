package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	//metodo para formatar as datas
	String obterData(){
		String formatado = "%d/%d/%d"; //vari�vel local
		return String.format(formatado, dia, mes, ano); //como se fosse um printf
		//retorna uma string formatada
	}
	
	//construtor padr�o c/ valores default
	//Data(){
		//dia = 1;
		//mes = 1;
		//ano = 1970;
	//}
	
	// -----------THIS E THIS()-----------//
	
	Data(int dia, int mes, int ano){//parametros do metodo construtor
		this.dia = dia; 			//this = referenciar o objeto atual
		this.mes = mes;             //j� cria o objeto com os dados passados no parametro do m�todo construtor
		this.ano = ano;
	}
	
	static void teste() {
		//this.dia = 3;
		//senten�a de c�digo inv�lida, pois um metodo est�tico est� assiciado a classe
		//this = somente em instancias
	}	
		//------construtor com THIS()-----//
	Data(){
		this(1, 2, 1990);
	}
	
		//----------VALORES PADR�O----------//
	//byte, short, int long -> 0
	//float, double -> 0.0
	//boolean -> false
	//char -> \u0000' primeiro elemento da tabela unicode
	
}

package classe;

public class Produto { //Nossa classe (MOLDE P/ FAZER OS OBJETOS)
	// a classe define os tipos
	String nome; //Atributo nome = String
	double preco; //Atributo preco = double
	static final double DESCONTO = 0.25; //Atributo desconto = double
	
	//criando os métodos
	double precoComDesconto(){ //tipo de retorno + nome do método
		return preco - (preco * DESCONTO);
	}
	
	double precoComDesconto(double descontoDoGerente){ //novo parametro
		return preco - (preco * (DESCONTO + descontoDoGerente));
	}
	//Metodos constrututores
	
	Produto(String nomeInicial){ //agora poderemos criar produtos passando um parâmetro
		nome = nomeInicial;//pois de forma explicita criamos o construtor que deve receber um parâmetro
		
	}
	Produto(String nomeInicial, double precoInicial){ 
		nome = nomeInicial;
		preco = precoInicial;
		
	}
	
	//recriando o construtor padrão sem parâmetros, caso queira usar
	//agora voce pode passar ou não o parâmetro em String
	Produto(){
		
	}
	
	
}


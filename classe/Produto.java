package classe;

public class Produto { //Nossa classe (MOLDE P/ FAZER OS OBJETOS)
	// a classe define os tipos
	String nome; //Atributo nome = String
	double preco; //Atributo preco = double
	static final double DESCONTO = 0.25; //Atributo desconto = double
	
	//criando os m�todos
	double precoComDesconto(){ //tipo de retorno + nome do m�todo
		return preco - (preco * DESCONTO);
	}
	
	double precoComDesconto(double descontoDoGerente){ //novo parametro
		return preco - (preco * (DESCONTO + descontoDoGerente));
	}
	//Metodos constrututores
	
	Produto(String nomeInicial){ //agora poderemos criar produtos passando um par�metro
		nome = nomeInicial;//pois de forma explicita criamos o construtor que deve receber um par�metro
		
	}
	Produto(String nomeInicial, double precoInicial){ 
		nome = nomeInicial;
		preco = precoInicial;
		
	}
	
	//recriando o construtor padr�o sem par�metros, caso queira usar
	//agora voce pode passar ou n�o o par�metro em String
	Produto(){
		
	}
	
	
}


package classe;

public class AreaCirc {
	
	//atributos/tipos
	double raio; 
	static final double PI = 3.14; 
	//valor de pi associado � classe, e n�o �s inst�ncias e c/ final = constante
	//utilizando o final, n�o � poss�vel alterar o valor do PI
	
	
	//m�todo construtor
	AreaCirc(double raioInicial){ 
		raio = raioInicial;
	}
	
	//construtor padr�o
	AreaCirc(){
		
	}
	
	//m�todo normal (m�todo de inst�ncia)
	double area() {
		return PI * Math.pow(raio, 2); //c�lculo de �rea
		
	//quando o nome da vari�vel est� em, it�lico, �, normalmente um atributo de classe
	//ou atributos est�ticos
	
	}
	
	//m�todo static (m�todo de classe)
	static double area(double raio) {
		return PI * Math.pow(raio, 2); //c�lculo de �rea
	}
	

}

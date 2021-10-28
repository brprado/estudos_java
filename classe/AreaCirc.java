package classe;

public class AreaCirc {
	
	//atributos/tipos
	double raio; 
	static final double PI = 3.14; 
	//valor de pi associado à classe, e não às instâncias e c/ final = constante
	//utilizando o final, não é possível alterar o valor do PI
	
	
	//método construtor
	AreaCirc(double raioInicial){ 
		raio = raioInicial;
	}
	
	//construtor padrão
	AreaCirc(){
		
	}
	
	//método normal (método de instância)
	double area() {
		return PI * Math.pow(raio, 2); //cálculo de área
		
	//quando o nome da variável está em, itálico, é, normalmente um atributo de classe
	//ou atributos estáticos
	
	}
	
	//método static (método de classe)
	static double area(double raio) {
		return PI * Math.pow(raio, 2); //cálculo de área
	}
	

}

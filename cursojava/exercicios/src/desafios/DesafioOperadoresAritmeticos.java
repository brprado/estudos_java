package desafios;

public class DesafioOperadoresAritmeticos {

	public static void main(String[] args) {

		//variáveis
		int exp1, potencia1, resultado1, exp2, resultado2, potDiv,
		finalOp, numerador, resultadoFinal, denA, denB;
		
		//primeira expressão
		exp1 = 6 * (3 + 2);
		potencia1 = (int) Math.pow(exp1, 2);
		denA = 3 * 2;
		resultado1 = potencia1 / denA;
		
		//segunda expressão
		denB = 2;
		exp2 = ((1 - 5) * (2 - 7) / denB);
		resultado2 = (int) Math.pow(exp2, 2);
		
		
		//operando com ambas as expressões
		potDiv = (int) Math.pow(10, 3);
		finalOp = (resultado1 - resultado2);
		numerador = (int) Math.pow(finalOp, 3);
		resultadoFinal = numerador / potDiv;
		System.out.println(resultadoFinal);
		
		
		

	}

}

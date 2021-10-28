package classe;

public class ValorVsReferencia {

		public static void main(String[] args) {
			
			double a = 2;
			double b = a; //atribui��o por valor (c�pia do valor definida em novo esa�o de mem�ria)
			a++;
			b--;
			System.out.println(a + " " + b); //valores independentes
			
			//Atribui��o por refer�ncia (objeto)
			
			Data d1 = new Data(5, 9, 2001);
			Data d2 = d1; //apontam p/ mesmo endere�o de mem�ria
			
			d1.dia = 31;
			d2.mes = 12;
			System.out.println(d1.obterData()); //output: 31/12/2001
			System.out.println(d1.obterData()); //output: 31/12/2001
			
			dataValorPadrao(d1);
			
			System.out.println(d1.obterData()); //output: 1/1/1970
			System.out.println(d1.obterData()); //output: 1/1/1970
			
			
			int c = 5;
			alterarPrimitivo(c);
			System.out.println(c);//o m�todo n�o causa impacto, pois a vari�vel � uma c�pia da outra
			

		}
		
		static void dataValorPadrao(Data d) { //objeto como par�metro
			d.dia = 1;
			d.mes = 1;
			d.ano = 1970;
		
		}
		static void alterarPrimitivo(int a) { //int a qualquer
			a++; //a��o do m�todo
		}
}

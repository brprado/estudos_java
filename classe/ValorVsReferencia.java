package classe;

public class ValorVsReferencia {

		public static void main(String[] args) {
			
			double a = 2;
			double b = a; //atribuição por valor (cópia do valor definida em novo esaço de memória)
			a++;
			b--;
			System.out.println(a + " " + b); //valores independentes
			
			//Atribuição por referência (objeto)
			
			Data d1 = new Data(5, 9, 2001);
			Data d2 = d1; //apontam p/ mesmo endereço de memória
			
			d1.dia = 31;
			d2.mes = 12;
			System.out.println(d1.obterData()); //output: 31/12/2001
			System.out.println(d1.obterData()); //output: 31/12/2001
			
			dataValorPadrao(d1);
			
			System.out.println(d1.obterData()); //output: 1/1/1970
			System.out.println(d1.obterData()); //output: 1/1/1970
			
			
			int c = 5;
			alterarPrimitivo(c);
			System.out.println(c);//o método não causa impacto, pois a variável é uma cópia da outra
			

		}
		
		static void dataValorPadrao(Data d) { //objeto como parâmetro
			d.dia = 1;
			d.mes = 1;
			d.ano = 1970;
		
		}
		static void alterarPrimitivo(int a) { //int a qualquer
			a++; //ação do método
		}
}

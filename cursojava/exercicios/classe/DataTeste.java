package classe;

public class DataTeste {

	public static void main(String[] args) {
		Data d1 = new Data(); //instanciando objeto da classe Data (d1)
		d1.dia = 5; //atribuindo valores
		d1.mes = 9;
		d1.ano = 2001;
		
		Data d2 = new Data();//instanciando objeto da classe Data (d1)
		d2.dia = 1; //atribuindo valores
		d2.mes = 5;
		d2.ano = 2000;
		
		Data d3 = new Data(); //construtor padrão c/ valores default
		
		Data d4 = new Data(18, 10, 2021); //construtor com parãmetros dia, mes e ano
		d4.ano = 2022; //voce pode fazer alterações no objeto
		
		Data d5 = new Data(5,12, 2003);
		System.out.println(d5.ano); //this.ano
		System.out.println(d5.obterData());
		
		System.out.println("Bruno -> " + d1.obterData()); //metodo criado na classe Data
		System.out.println("Alexandre -> " + d2.obterData());
		System.out.println("hoje é dia ->" + d3.obterData());
		System.out.println("hoje é dia ->" + d4.obterData());
		


}}

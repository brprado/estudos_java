package classe;

public class ProdutoTeste { //criando / instanciando nossos objetos 
	//com basse na classe "Poduto"
	
	public static void main(String[] args) {
	
		
		//CRIANDO OBJETO C/ MÉTODO CONSTRUTOR
		Produto p1 = new Produto("Notebook", 4556.69);
		//Instanciando um objeto do tipo produto
		//uma classe define um tipo, no caso, "Produto"
		
		//OU
		
		var p2 = new Produto("Caneta azul", 12.56); 
		//também funciona assim, pois o java faz por ifererência

		
		
		Produto p3 = new Produto("Notebook gamer", 21412.65);
		
		
		Produto p4 = new Produto();
		p4.nome = "Monitor Samsung 4K UHD";
		p4.preco = 2500;
		
		
		
		System.out.println("====Produto 01====\n");
		System.out.println(p1.nome);
		System.out.println(p1.preco);
		System.out.println(Produto.DESCONTO * 100 + "%");
		System.out.printf("Preço com desconto: R$%.2f ", p1.precoComDesconto() );
		
		System.out.println("\n====Produto 02====\n");
		System.out.println(p2.nome);
		System.out.println(p2.preco - (p2.preco * Produto.DESCONTO));
		System.out.println(Produto.DESCONTO * 100 + "%");
		System.out.printf("Preco com desconto: R$%.2f ", p2.precoComDesconto()); //utilizando metodo criado em um determinado  obj
		
		System.out.println("\n====Produto 03====\n");
		System.out.println(p3.nome);
		System.out.println(p3.preco);
		System.out.println(Produto.DESCONTO);
		System.out.println(p3.precoComDesconto());
		
		
		System.out.println("\n====Produto 04====\n");
		System.out.println(p4.nome);
		System.out.printf("Preço: R$%.2f", p4.preco);
		System.out.println("\nDesconto: " + Produto.DESCONTO * 100 + "%");
		System.out.printf("Preço com desconto %.2f", p4.precoComDesconto(0));
		
		
		
		
/*Com um unico molde (nossa classe que define o tipo) criamos duas
 * instâncias desta classe*/
		
		//quando chamamos com parenteses = método ex:   p2.precoComDesconto();
		//quando chamamos sem parenteses = atributo ex: p2.desconto;
		
	}

}

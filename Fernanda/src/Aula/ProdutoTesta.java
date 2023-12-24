package Aula;

public class ProdutoTesta {
	
	public static void main(String[] args) {
		
		// construtor padrão
		
		Produto p1 = new Produto();
		p1.nome = "Caneta Preta";
		p1.marca = "Bic";
		p1.valor = 1.50f;
		
		// construtor de dois p;arâmetro
		
		Produto p2 = new Produto("Caneta Vermelha", "FABER");
		p2.valor = 1.69f;
		
		// construtor de tres parâmetro
		
		Produto p3 = new Produto("bORRACHA", "mERCUR", 1.89f);
		
		//objeto p1
		
		System.out.println("Nome: " + p1.nome + " Marca: " + p1.marca + " Valor: " + p1.valor);
		
	}
	

}

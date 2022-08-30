package Ex3;

public class Teste {

	public static void main(String[] args) {
		
		Produto miniPc = new Produto();
		
		miniPc.Nome = "MiniPC";
		miniPc.Preco = 5000;
		miniPc.calculaFrete();
		
		System.out.println(miniPc.Preco);
		
		Produto soundBar = new Produto();
		
		soundBar.Nome = "MiniPC";
		soundBar.Preco = 5000;
		soundBar.calculaFrete();
		
		System.out.println(soundBar.Preco);
		
		ProdutoPremium superServidor = new ProdutoPremium();
		
		superServidor.Nome = "SuperServidor";
		superServidor.Preco = 30000;
		superServidor.calculaFrete();
		
		System.out.println(superServidor.Preco);
		
		// TEM QUE ADICIONAR PESO E VOLUME AINDA NO EX!
		
	}
	
}

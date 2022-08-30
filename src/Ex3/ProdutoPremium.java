package Ex3;

public class ProdutoPremium extends baseProduto {

	@Override
	public void calculaFrete() {
		this.Preco += this.Preco * 0.3;
	}
	
	
}

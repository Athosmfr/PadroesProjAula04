package Ex3;

public class Produto extends baseProduto {

	@Override
	public void calculaFrete() {
		this.Preco += this.Preco * 0;
	}
	
}

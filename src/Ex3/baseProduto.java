package Ex3;

public class baseProduto implements iProduto {

	public String Nome;
	public double Preco;
	public double txFrete;
	
	
	@Override
	public void calculaFrete() {
		this.Preco += this.Preco * (this.txFrete);
	}

	
	
}

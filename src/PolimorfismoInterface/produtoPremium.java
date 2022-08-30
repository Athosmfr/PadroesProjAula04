package PolimorfismoInterface;

public class produtoPremium implements iProduto {

	produtoPremium() {
		this.txFrete = 0.1;
	}
	
	public double Preco;
	public double txFrete;
	
	@Override
	public void calcularFrete() {
		this.Preco += this.Preco * (this.txFrete);
	}
	
}

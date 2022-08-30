package PolimorfismoInterface;

public class produto implements iProduto {

	produto() {
		this.txFrete = 0;
	}
	
	public double Preco;
	public double txFrete;
	
	@Override
	public void calcularFrete() {
		this.Preco += this.Preco * (this.txFrete);
	}
	
}

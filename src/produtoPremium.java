
public class produtoPremium extends baseProduto {
	
	produtoPremium(){
		this.taxaFrete = 0.1;
	}
	
	@Override
	public double calculaFrete() {
		return this.Preco * (this.taxaFrete);
	}
	
}

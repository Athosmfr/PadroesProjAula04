
public class cliente_do_produto {

	public double valorFrete;
	
	public void acumularFrete(baseProduto p) {
		this.valorFrete += p.calculaFrete();
	}
	
}

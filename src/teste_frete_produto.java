
public class teste_frete_produto {

	public static void main(String[] args) {
		
		cliente_do_produto cli = new cliente_do_produto();
		produto p = new produto();
		p.Nome = "Mouse";
		p.Preco = 145.99;
		
		cli.acumularFrete(p);
		System.out.println(cli.valorFrete);
		
		
		produtoPremium pm = new produtoPremium();
		pm.Nome = "Ferrari";
		pm.Preco = 1000000;
		pm.calculaFrete();
		
		cli.acumularFrete(pm);
		System.out.println(cli.valorFrete);
	}
	
}

// Interface só entrega metodo, não atributos;
// Abstrata entrega metodos e atributos;

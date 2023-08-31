package carrinhoCompras;

public class Livro extends Produto{
	private boolean educacional;
	
	public Livro(String id, String nome, boolean educacional) {
		super(id, nome);
		this.educacional = educacional;
		if(this.educacional == true) {
			super.setDescricao("Educacional");
		}else {
			super.setDescricao("Não Educacional");
		}
	}

	@Override
	public void setCusto(int custo) {
		double porcentagem = 1.3;
		
		try {
			if (this.educacional == true) {
				 porcentagem = 1.2; 
			}
			
			double precoFinal = custo * porcentagem;
			double imposto = this.calcImposto(precoFinal);
			
			// super.setTotalValor(precoFinal);
			super.setPreco(precoFinal);
			super.setImposto(imposto);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public double calcImposto(double precoFinal) {
		double imposto = 0.1;
		
		if (this.educacional == true) {
			imposto = 0.05; 
		}
		
		double valorImposto = precoFinal * imposto;
		// super.setTotalImpostoValor(valorImposto);
		return valorImposto;
	}
	
}

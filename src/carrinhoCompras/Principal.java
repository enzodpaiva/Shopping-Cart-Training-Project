package carrinhoCompras;

import java.util.Collection;

public class Principal {

	public static void main(String[] args) {
		// carrinho de compras
		Carrinho c = new Carrinho();

		// brinquedo
		Brinquedo b = new Brinquedo("b1", "Brinquedo 1");

		// ajusta custo
		b.setCusto(50);

		// livro não educacional
		Livro l1 = new Livro("l1", "Livro 1", false);
		// livro educacional
		Livro l2 = new Livro("l2", "Livro 2", true);

		// ajusta custos
		l1.setCusto(100);
		l2.setCusto(300);

		// eletrônico classe 1
		Eletronico e1 = new Eletronico("e1", "Eletrônico 1", 1);
		// eletrônico classe 2
		Eletronico e2 = new Eletronico("e2", "Eletrônico 2", 2);
		// eletrônico classe 3
		Eletronico e3 = new Eletronico("e3", "Eletrônico 3", 3);

		// ajusta custos
		e1.setCusto(500);
		e2.setCusto(600);
		e3.setCusto(700);

		// inclui produtos no carrinho
		c.incluir(b);
		c.incluir(l1);
		c.incluir(l2);
		c.incluir(e1);
		c.incluir(e2);
		c.incluir(e3);

		// exibe relatórios
		c.exibirRelatorioPorNome();
		System.out.println("\n");
		c.exibirRelatorioPorValor();
		System.out.println("\n");

		// remove um produto
		c.remover(e2.getId());

		// exibe relatórios
		c.exibirRelatorioPorNome();
		System.out.println("\n");
		c.exibirRelatorioPorValor();
		System.out.println("\n");
	}

}

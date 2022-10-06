package br.com.escolinhadotioali.csv;

import java.util.List;

public class TotalPrecoCategorias {
	
	public double calcularTotalPreco(List<CategoriaCsv> categorias) {
		double somaPrecos = 0.0;
		for (CategoriaCsv categoria : categorias) { 
			somaPrecos = somaPrecos + Double.parseDouble(categoria.getPreco());
		}
		return somaPrecos;
	}

}

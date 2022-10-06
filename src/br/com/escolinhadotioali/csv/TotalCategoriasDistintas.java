package br.com.escolinhadotioali.csv;

import java.util.ArrayList;
import java.util.List;

public class TotalCategoriasDistintas {

	public int calcularCategoriasDistintas(List<SubcategoriaCsv> subcategorias) {
		List<String> categoriasQueJaApareceram = new ArrayList<>();
		
		for (SubcategoriaCsv subcategoriaCsv : subcategorias) {
			String categoria = subcategoriaCsv.getCategoria();
			if (!categoriasQueJaApareceram.contains(categoria)) { // Tem um jeito mais rápido de fazer com a estrutura de dados Set
				categoriasQueJaApareceram.add(categoria);
			}
		}

		return categoriasQueJaApareceram.size();
	}
	
}

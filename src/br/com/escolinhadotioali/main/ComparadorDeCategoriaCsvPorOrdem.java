package br.com.escolinhadotioali.main;

import java.util.Comparator;

import br.com.escolinhadotioali.csv.CategoriaCsv;

public class ComparadorDeCategoriaCsvPorOrdem implements Comparator<CategoriaCsv> {

	@Override
	public int compare(CategoriaCsv c1, CategoriaCsv c2) {
		// comparando c1 com c2
		
		// c1 é igual a c2   ======> tem que retornar 0
		// c1 é maior que c2 ======> tem que retornar um número qualquer positivo (> 0)
		// c1 é menor que c2 ======> tem que retornar um número qualquer negativo (< 0)
		
		int ordemC1 = Integer.parseInt(c1.getOrdem());
		int ordemC2 = Integer.parseInt(c2.getOrdem());
		
		if (ordemC1 == ordemC2) {
			return 0;
		} else if (ordemC1 > ordemC2) {
			return 1;
		} else {
			return -1;
		}
	}

}

package br.com.escolinhadotioali.main;

import java.io.FileNotFoundException;
import java.util.List;

import br.com.escolinhadotioali.csv.CategoriaCsv;
import br.com.escolinhadotioali.csv.LeitorCategoriaCsv;

public class MainLeitorCategoriaCsv {
	
	public static void main(String[] args) throws FileNotFoundException {
		LeitorCategoriaCsv leitorCategoriaCsv = new LeitorCategoriaCsv();
		List<CategoriaCsv> categoriasCsv = leitorCategoriaCsv.lerCategoriasCsv();
		
//		for (int i = 0; i < categoriasCsv.size(); i++) {
//			CategoriaCsv categoria = categoriasCsv.get(i);
//			System.out.println(categoria.getNome() + ": " + categoria.getDescricao());
//		}

		// for each (para cada)
		for (CategoriaCsv categoria : categoriasCsv) { 
			System.out.println(categoria.getNome() + ": " + categoria.getDescricao());
		}
		
	}

}

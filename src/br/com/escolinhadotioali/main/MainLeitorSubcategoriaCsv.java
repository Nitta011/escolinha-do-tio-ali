package br.com.escolinhadotioali.main;

import java.io.FileNotFoundException;
import java.util.List;

import br.com.escolinhadotioali.csv.LeitorSubcategoriaCsv;
import br.com.escolinhadotioali.csv.SubcategoriaCsv;

public class MainLeitorSubcategoriaCsv {

	public static void main(String[] args) throws FileNotFoundException {
		LeitorSubcategoriaCsv leitor = new LeitorSubcategoriaCsv();
		List<SubcategoriaCsv> subcategorias = leitor.lerSubcategoriasCsv();
		
		for (SubcategoriaCsv subcategoriaCsv : subcategorias) {
			System.out.println(subcategoriaCsv);
		}
	}
	
}

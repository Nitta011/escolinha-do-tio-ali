package br.com.escolinhadotioali.main;

import java.io.FileNotFoundException;
import java.util.List;

import br.com.escolinhadotioali.csv.LeitorSubcategoriaCsv;
import br.com.escolinhadotioali.csv.SubcategoriaCsv;
import br.com.escolinhadotioali.csv.TotalCategoriasDistintas;

public class MainTotalCategoriasDistintas {

	public static void main(String[] args) throws FileNotFoundException {
		
		LeitorSubcategoriaCsv leitor = new LeitorSubcategoriaCsv();
		List<SubcategoriaCsv> subcategorias = leitor.lerSubcategoriasCsv();
		
		TotalCategoriasDistintas totalCategoriasDistintas = new TotalCategoriasDistintas();
		int total = totalCategoriasDistintas.calcularCategoriasDistintas(subcategorias);
		System.out.println(total);
	}
	
}

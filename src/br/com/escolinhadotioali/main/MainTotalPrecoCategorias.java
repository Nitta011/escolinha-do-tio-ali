package br.com.escolinhadotioali.main;

import java.io.FileNotFoundException;
import java.util.List;

import br.com.escolinhadotioali.csv.CategoriaCsv;
import br.com.escolinhadotioali.csv.LeitorCategoriaCsv;
import br.com.escolinhadotioali.csv.TotalPrecoCategorias;

public class MainTotalPrecoCategorias {
	
	public static void main(String[] args) throws FileNotFoundException {
		LeitorCategoriaCsv leitor = new LeitorCategoriaCsv();
		List<CategoriaCsv> categorias = leitor.lerCategoriasCsv();
		
		TotalPrecoCategorias totalPreco = new TotalPrecoCategorias();
		System.out.println(totalPreco.calcularTotalPreco(categorias));
	}

}

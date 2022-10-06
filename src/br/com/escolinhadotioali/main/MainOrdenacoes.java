package br.com.escolinhadotioali.main;

import java.io.FileNotFoundException;
import java.util.List;

import br.com.escolinhadotioali.csv.CategoriaCsv;
import br.com.escolinhadotioali.csv.LeitorCategoriaCsv;

public class MainOrdenacoes {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		LeitorCategoriaCsv leitorCategoriaCsv = new LeitorCategoriaCsv();
		List<CategoriaCsv> categoriasCsv = leitorCategoriaCsv.lerCategoriasCsv();
		
		ComparadorDeCategoriaCsvPorPreco porPreco = new ComparadorDeCategoriaCsvPorPreco();
		categoriasCsv.sort(porPreco);
		
		System.out.println("Categoria mais barata: " + categoriasCsv.get(0));
		System.out.println("Categoria mais cara: " + categoriasCsv.get(categoriasCsv.size() - 1));
		
		System.out.println("-----------");
		System.out.println("Por ordem crescente");
		
		ComparadorDeCategoriaCsvPorOrdem porOrdem = new ComparadorDeCategoriaCsvPorOrdem();
		categoriasCsv.sort(porOrdem);
		
		for (CategoriaCsv categoriaCsv : categoriasCsv) {
			System.out.println(categoriaCsv);
		}
		
		System.out.println("-----------");
		System.out.println("Por ordem decrescente");


		categoriasCsv.sort(porOrdem.reversed());
		
		for (CategoriaCsv categoriaCsv : categoriasCsv) {
			System.out.println(categoriaCsv);
		}

//		Para funcionar com null tem que colocar Comparable
		
//		System.out.println("-----------");
//		System.out.println("Natural");
//		categoriasCsv.sort(null);
//		for (CategoriaCsv categoriaCsv : categoriasCsv) {
//			System.out.println(categoriaCsv);
//		}
		
	}

}





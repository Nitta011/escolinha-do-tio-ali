package br.com.escolinhadotioali.csv;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeitorSubcategoriaCsv {
	
	public List<SubcategoriaCsv> lerSubcategoriasCsv() throws FileNotFoundException {
		List<SubcategoriaCsv> subcategorias = new ArrayList<>();
		
		InputStream inputStream = new FileInputStream("planilha-dados-escola-Subcategoria.csv");
		Scanner scanner = new Scanner(inputStream);
		
		scanner.nextLine();
		
		while(scanner.hasNextLine()) {
			
			String linha = scanner.nextLine();
			String[] dados = linha.split(",");
			
			String nome = dados[0];
			String codigo = dados[1];
			String ordem = dados[2];
			String descricao = dados[3];
			String status = dados[4];
			String categoria = dados[5];
			
			SubcategoriaCsv subcategoriaCsv = new SubcategoriaCsv(nome, codigo, ordem, descricao, status, categoria);
			
			subcategorias.add(subcategoriaCsv);			
		}
		
		
		return subcategorias;
	}

}

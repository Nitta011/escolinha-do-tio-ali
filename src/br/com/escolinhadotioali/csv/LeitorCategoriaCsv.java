package br.com.escolinhadotioali.csv;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeitorCategoriaCsv {
	
	public List<CategoriaCsv> lerCategoriasCsv() throws FileNotFoundException {
		List<CategoriaCsv> categorias = new ArrayList<CategoriaCsv>();
		
		InputStream inputStream = new FileInputStream("planilha-dados-escola-Categoria.csv");
		Scanner scanner = new Scanner(inputStream);
		
		scanner.nextLine();
		
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();

			String[] valores = linha.split(",");
			
			String nome = valores[0];
			String codigo = valores[1];
			String ordem = valores[2];
			String descricao = valores[3];
			String status = valores[4];
			String icone = valores[5];
			String cor = valores[6];
			
			CategoriaCsv categoria = new CategoriaCsv(nome, codigo, ordem, descricao, status, icone, cor);
			
			categorias.add(categoria);
			
		}
		
		return categorias;
	}

}

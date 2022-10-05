package br.com.escolinhadotioali.csv;

public class CategoriaCsv {
	
	private String nome;
	private String codigo;
	private String ordem;
	private String descricao;
	private String status;
	private String icone;
	private String cor;
	
	public CategoriaCsv(String nome, String codigo, String ordem, String descricao, String status, String icone,
			String cor) {
		this.nome = nome;
		this.codigo = codigo;
		this.ordem = ordem;
		this.descricao = descricao;
		this.status = status;
		this.icone = icone;
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public String getOrdem() {
		return ordem;
	}
	public String getDescricao() {
		return descricao;
	}
	public String getStatus() {
		return status;
	}
	public String getIcone() {
		return icone;
	}
	public String getCor() {
		return cor;
	}

	
}

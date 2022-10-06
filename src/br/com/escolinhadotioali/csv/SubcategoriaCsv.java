package br.com.escolinhadotioali.csv;

public class SubcategoriaCsv {
	
	private String nome, codigo, ordem, descricao, status, categoria;

	public SubcategoriaCsv(String nome, String codigo, String ordem, String descricao, String status,
			String categoria) {
		this.nome = nome;
		this.codigo = codigo;
		this.ordem = ordem;
		this.descricao = descricao;
		this.status = status;
		this.categoria = categoria;
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

	public String getCategoria() {
		return categoria;
	}

	@Override
	public String toString() {
		return "SubcategoriaCsv [nome=" + nome + ", codigo=" + codigo + ", ordem=" + ordem + ", descricao=" + descricao
				+ ", status=" + status + ", categoria=" + categoria + "]";
	}

	

}

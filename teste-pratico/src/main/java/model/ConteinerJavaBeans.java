package model;

public class ConteinerJavaBeans {

	private int id_conteiner;
	private String nome_cliente, numero_conteiner, tipo_conteiner, status_conteiner, categoria_conteiner;
	
	public ConteinerJavaBeans() {}
	
	public ConteinerJavaBeans(int id_conteiner, String nome_cliente, String numero_conteiner, String tipo_conteiner, String status_conteiner, String categoria_conteiner) {
		this.id_conteiner = id_conteiner;
		this.nome_cliente = nome_cliente;
		this.numero_conteiner = numero_conteiner;
		this.tipo_conteiner = tipo_conteiner;
		this.status_conteiner = status_conteiner;
		this.categoria_conteiner = categoria_conteiner;
	}

	public int getId_conteiner() {
		return id_conteiner;
	}

	public void setId_conteiner(int id_conteiner) {
		this.id_conteiner = id_conteiner;
	}

	public String getNome_cliente() {
		return nome_cliente;
	}

	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}

	public String getNumero_conteiner() {
		return numero_conteiner;
	}

	public void setNumero_conteiner(String numero_conteiner) {
		this.numero_conteiner = numero_conteiner;
	}

	public String getTipo_conteiner() {
		return tipo_conteiner;
	}

	public void setTipo_conteiner(String tipo_conteiner) {
		this.tipo_conteiner = tipo_conteiner;
	}

	public String getStatus_conteiner() {
		return status_conteiner;
	}

	public void setStatus_conteiner(String status_conteiner) {
		this.status_conteiner = status_conteiner;
	}

	public String getCategoria_conteiner() {
		return categoria_conteiner;
	}

	public void setCategoria_conteiner(String categoria_conteiner) {
		this.categoria_conteiner = categoria_conteiner;
	}
}

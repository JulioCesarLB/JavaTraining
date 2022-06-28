package br.com.fiap.fabricaVeiculos;

public class Cambio {
	private String tipo, marca, qtdMarcha, tamanho;

	public Cambio(String tipo, String marca, String qtdMarcha, String tamanho) {
		this.tipo = tipo;
		this.marca = marca;
		this.qtdMarcha = qtdMarcha;
		this.tamanho = tamanho;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getQtdMarcha() {
		return qtdMarcha;
	}

	public void setQtdMarcha(String qtdMarcha) {
		this.qtdMarcha = qtdMarcha;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	
}

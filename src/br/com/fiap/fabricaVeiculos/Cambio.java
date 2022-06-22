package br.com.fiap.fabricaVeiculos;

public class Cambio {
	private String marca, tipo;

	public Cambio(String marca, int qntMarcha, String tipo) {
		super();
		this.marca = marca;
		this.qntMarcha = qntMarcha;
		this.tipo = tipo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public int getQntMarcha() {
		return qntMarcha;
	}
	
	private int qntMarcha;

}

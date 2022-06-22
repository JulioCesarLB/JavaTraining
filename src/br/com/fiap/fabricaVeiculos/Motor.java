package br.com.fiap.fabricaVeiculos;

public class Motor {
	private int qntCilindros,qntVelas;
	private double potencia;
	private String tipo, marca;
	
	public Motor(double potencia, int qntCilindros, int qntVelas, String tipo, String marca) {
		super();
		this.potencia = potencia;
		this.qntCilindros = qntCilindros;
		this.qntVelas = qntVelas;
		this.tipo = tipo;
		this.marca = marca;
	}
	
	public double getPotencia() {
		return potencia;
	}
	public int getQntCilindros() {
		return qntCilindros;
	}
	public int getQntVelas() {
		return qntVelas;
	}
	public String getTipo() {
		return tipo;
	}
	public String getMarca() {
		return marca;
	}
}

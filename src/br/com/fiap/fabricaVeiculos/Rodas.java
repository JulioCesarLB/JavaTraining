package br.com.fiap.fabricaVeiculos;

public class Rodas {


	private String marca, material,calota;
	private double aro;

	public Rodas(double aro, String marca, String material, String calota) {
		this.aro = aro;
		this.marca = marca;
		this.material = material;
		this.calota = calota;
	}
	public Double getAro() {
		return aro;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getMaterial() {
		return material;
	}
	
	public String getCalota() {
		return calota;
	}
	
}

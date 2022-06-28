package br.com.fiap.fabricaVeiculos;

public class Roda {
	private String aroRoda, material, offSet, tala, calota;

	public String getAroRoda() {
		return aroRoda;
	}

	public void setAroRoda(String aroRoda) {
		this.aroRoda = aroRoda;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getOffSet() {
		return offSet;
	}

	public void setOffSet(String offSet) {
		this.offSet = offSet;
	}

	public String getTala() {
		return tala;
	}

	public void setTala(String tala) {
		this.tala = tala;
	}

	public Roda(String aroRoda, String material, String offSet, String tala) {
		this.aroRoda = aroRoda;
		this.material = material;
		this.offSet = offSet;
		this.tala = tala;
	}
	
	
}


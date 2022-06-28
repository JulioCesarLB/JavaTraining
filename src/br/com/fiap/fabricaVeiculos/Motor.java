package br.com.fiap.fabricaVeiculos;

public class Motor {
	private String potencia, cavalo, grauProtecao, carcacaMotor, qtdPistao;

	public Motor(String potencia, String cavalo, String grauProtecao, String carcacaMotor) {
		super();
		this.potencia = potencia;
		this.cavalo = cavalo;
		this.grauProtecao = grauProtecao;
		this.carcacaMotor = carcacaMotor;
	}

	public String getPotencia() {
		return potencia;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}

	public String getCavalo() {
		return cavalo;
	}

	public void setCavalo(String cavalo) {
		this.cavalo = cavalo;
	}

	public String getGrauProtecao() {
		return grauProtecao;
	}

	public void setGrauProtecao(String grauProtecao) {
		this.grauProtecao = grauProtecao;
	}

	public String getCarcacaMotor() {
		return carcacaMotor;
	}

	public void setCarcacaMotor(String carcacaMotor) {
		this.carcacaMotor = carcacaMotor;
	}
	
}

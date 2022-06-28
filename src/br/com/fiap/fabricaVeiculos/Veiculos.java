package br.com.fiap.fabricaVeiculos;

public abstract class Veiculos {
	protected Roda roda;
	protected Cambio cambio;
	protected Motor motor;
	protected String marca, modelo, cor, renavam, nomeCondutor, anoFabricao, anoModelo;
	protected boolean isLigado;
	protected long velocidade;

	public Veiculos(Roda roda, Cambio cambio, Motor motor, String marca, String modelo, String cor, String renavam,
			String nomeCondutor, String anoFabricao, String anoModelo) {
		this.roda = roda;
		this.cambio = cambio;
		this.motor = motor;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.renavam = renavam;
		this.nomeCondutor = nomeCondutor;
		this.anoFabricao = anoFabricao;
		this.anoModelo = anoModelo;
	}

	public void ligar() {
		this.isLigado = true;
		System.out.println("Veiculo ligado");

	};

	public void desligar() {
		if (velocidade == 0) {
			this.isLigado = false;
			System.out.println("Veiculo desligado");
		} else if (velocidade > 0) {
			System.out.println("Perigo ao desligar, velocidade: " + velocidade);
		}
	};

	public long acelerar(long acelerando) {
		if (isLigado == true) {
			this.velocidade += acelerando;
			System.out.println("Valocidade aumentada: " + velocidade);
			return velocidade;
		} else {
			System.out.println("Ligando carro...");
			ligar();
			acelerar(acelerando);
			return acelerando;
		}
	}

	public long frear(long freiando) {
		if (isLigado == true) {
			this.velocidade -= freiando;
			System.out.println("Velocidade diminuida: " + velocidade);
			return velocidade;
		} else {
			System.out.println("Seu carro já está parado");
			return velocidade;
		}
	}

	public abstract void exibirDados();
}

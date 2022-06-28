package br.com.fiap.fabricaVeiculos;

public class Moto extends Veiculos {
	private String capaceteCor;
	
	
	
	public Moto(Roda roda, Cambio cambio, Motor motor, String marca, String modelo, String cor, String renavam,
			String nomeCondutor, String anoFabricao, String anoModelo, String capaceteCor) {
		super(roda, cambio, motor, marca, modelo, cor, renavam, nomeCondutor, anoFabricao, anoModelo);
		this.capaceteCor = capaceteCor;
	}
	
	public void empinar(boolean empinar) {
		if (velocidade > 70 && isLigado == true) {
			System.out.println("Você está empinando sua moto: VRUM VRUM...");
		} else if(velocidade < 70) {
			System.out.println("Sua velocidade está muito baixa para empinar");
		}
		
		else {
			System.out.println("Ligando moto...");
			ligar();
			System.out.println("Acelere seu moto.");
		}
	}

	@Override
	public void exibirDados() {
		System.out.println("Condutor do moto: "+ this.nomeCondutor);
		System.out.println("Marca do seu moto: "+ this.marca); 
		System.out.println("Modelo da moto: " + this.modelo); 
		System.out.println("Cor da moto: "+ this.cor); 
		System.out.println("Renavam da moto: " + this.renavam); 
		System.out.println("Informações da roda deste moto: " + this.roda.getAroRoda() +", "+ this.roda.getMaterial() +", "+ this.roda.getOffSet() +", "+ this.roda.getTala()); // CHAMANDO POR UM getter, o aro desta roda 
		System.out.println("Potência do motor deste moto: " + this.motor.getPotencia());
		System.out.println("Tipo de Cambio de seu moto: " + this.cambio.getTipo());
		System.out.println("Ano de Fabricacao da moto: "+ this.anoFabricao);
		System.out.println("Ano do modelo da moto: "+ this.anoModelo);
		System.out.println("Cor do capacete da sua moto: " + this.capaceteCor);
		System.out.println("Velocidade neste exato momento: " + this.velocidade);
		System.out.println("");
	}
	
}

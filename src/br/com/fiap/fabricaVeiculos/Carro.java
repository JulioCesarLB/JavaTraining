package br.com.fiap.fabricaVeiculos;

public class Carro extends Veiculos {
	private String aerofolio;
	protected double tanque=0, capacidadeRolagem=0;
	
	

	public Carro(Roda roda, Cambio cambio, Motor motor, String marca, String modelo, String cor, String renavam,
			String nomeCondutor, String anoFabricao, String anoModelo, String aerofolio) {
		super(roda, cambio, motor, marca, modelo, cor, renavam, nomeCondutor, anoFabricao, anoModelo);
		this.aerofolio = aerofolio;
	}


	@Override
	public void exibirDados() {
		System.out.println("Condutor do carro: "+ nomeCondutor);
		System.out.println("Marca do carro: "+ marca); 
		System.out.println("Modelo do carro: " + modelo); 
		System.out.println("Cor do carro: "+ cor); 
		System.out.println("Informações da roda deste carro: " + this.roda.getAroRoda() + ", " + this.roda.getMaterial() + ", "+ this.roda.getOffSet() + ", "+ this.roda.getTala()); // CHAMANDO POR UM getter, o aro desta roda 
		System.out.println("Potência do motor deste carro: " + this.motor.getPotencia());
		System.out.println("Tipo de Cambio de seu carro: " + this.cambio.getTipo());
		System.out.println("Renavam do carro: " + renavam); 
		System.out.println("Ano de Fabricacao: "+ anoFabricao);
		System.out.println("Ano do modelo do carro: "+ anoModelo);
		System.out.println("Velocidade neste exato momento: " + velocidade);
		System.out.println("Aerofólio deste carro: "  + this.aerofolio);	
		System.out.println("");
	}
	public void Abastecimento(Combustivel combustivel, double valor) {
		if(valor>0 && tanque+valor<=50) {
		tanque+= valor;
		capacidadeRolagem+= combustivel.abestecimento(valor);
		}else {
			System.out.println("Valor inválido");
		}
		
		
	}
}

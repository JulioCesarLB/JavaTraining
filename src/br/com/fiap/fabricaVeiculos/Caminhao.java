package br.com.fiap.fabricaVeiculos;

public class Caminhao extends Veiculos {
	private String eixo;
	private long cargaAbastecida, cargaSuportada;
	
	public Caminhao(Roda roda, Cambio cambio, Motor motor, String marca, String modelo, String cor, String renavam,
			String nomeCondutor, String anoFabricao, String anoModelo, String eixo, long cargaSuportada) {
		super(roda, cambio, motor, marca, modelo, cor, renavam, nomeCondutor, anoFabricao, anoModelo);
		this.eixo = eixo;
		this.cargaSuportada = cargaSuportada;
	}
	public void carregar(long carregar) {
		if(carregar > cargaSuportada || cargaAbastecida >= cargaSuportada) {
			System.out.println("Peso da carga excedeu ou igualou ao peso suportado: ");
		} else {
			this.cargaAbastecida += carregar;
			System.out.println("Carregamos seu caminhÃ£o, peso de carga nesse momento: " + cargaAbastecida);
		}
	};
	public void descarregar(long descarregar) {
		if (cargaAbastecida == 0) {
			System.out.println("NÃ£o temos oque descarregar: " + cargaAbastecida);
		} else {
			this.cargaAbastecida -=descarregar;
			System.out.println("Descarregamos a sua carga, peso atualizado: "+ cargaAbastecida);
		}
	}

	@Override
	public void exibirDados() {
		System.out.println("Condutor do caminhao: "+ this.nomeCondutor);
		System.out.println("Marca do seu caminhao: "+ this.marca); 
		System.out.println("Modelo do caminhao: " + this.modelo); 
		System.out.println("Cor do caminhao: "+ this.cor); 
		System.out.println("Renavam do caminhao: " + this.renavam); 
		System.out.println("Informações da roda deste caminhao: " + this.roda.getAroRoda() +", "+ this.roda.getMaterial() +", "+ this.roda.getOffSet() +", "+ this.roda.getTala()); // CHAMANDO POR UM getter, o aro desta roda 
		System.out.println("Potência do motor deste caminhao: " + this.motor.getPotencia());
		System.out.println("Tipo de Cambio de seu caminhao: " + this.cambio.getTipo());
		System.out.println("Ano de Fabricacao: "+ this.anoFabricao);
		System.out.println("Ano do modelo do caminhao: "+ this.anoModelo);
		System.out.println("Quantidade carga abastecida: "+ this.cargaAbastecida +" kg's");
		System.out.println("Quantidade de carga suportada: "+ this.cargaSuportada + " kg's");
		System.out.println("Velocidade neste exato momento: " + this.velocidade);
		System.out.println("Tipo do eixo de seu caminhao: " + this.eixo);
		System.out.println("");
	};
}

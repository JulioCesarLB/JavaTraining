package br.com.fiap.fabricaVeiculos;

import java.util.Date;

public class Executavel {
	public static void main(String[] args) {
		Motor motor = new Motor(4.6,48,20,"em v","fiat");
		Rodas rodas = new Rodas(2.3,"fiat","borracha","orbitral");
		Cambio cambio = new Cambio("fiat",90,"manual");
		
		Carro carro = new Carro("Fiat", "uno", "preto", motor,rodas,
			"Miguel", 2020, cambio, 1215664547l);
		
		carro.ligar();
		
		
		//Abstract na class proibi a istanciação
		//Abstract no metodo sinaliza ao programador que aquele metodo deve ser rescrito nas classes filhas
		
		//@Override sinaliza que o metódo está sendo reescrito
		
	}
}

package br.com.fiap.fabricaVeiculos;

public abstract class Acoes {
	protected double velocidade = 0;
	protected boolean estado = false;
	
	
	public void ligar() {
		if(this.estado) {
			System.out.println("O carro ja está ligado"); 
		}else {
			this.estado = true;
			System.out.println("O carro foi ligado");
		}
	}
	public void desligar() {
		if(this.estado) {
			if(this.velocidade>0) {
				System.out.println("O carro precisa estar parado");
			}else {
				this.estado= false;
				System.out.println("Carro desligado");
			}
		}else {
			System.out.println("O carro ja está desligado");
		}
	}
	public void acelerar(double valor) {
		if(this.estado) {
			this.velocidade =this.velocidade+valor;		
		    System.out.println("Velocidade alterada: "+this.velocidade);	
		}else {
			System.out.println("O carro não está ligado");
		}
		
	}
	public void frear(double valor) {
		if(this.velocidade>0 && valor>0 ) {
			if(valor>this.velocidade) {
				this.velocidade=0;
			}else {
				this.velocidade = this.velocidade -valor;
			}
		}else if(valor<0) {
			System.out.println("Valor inválido");
		}
		else {
			System.out.println("O carro está parado");
		}
		
	}
	public void close() {
		System.exit(0);
	}
	

}

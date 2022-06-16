package br.com.fiap.fabricaVeiculos;

import java.util.Date;

public class Carro {
	private String marca,modelo,cor, motor, aroRodas, nmCliente;
	private Date anoFabrica;
	private char tipoCambio;
	private double velocidade;
	private long renavam;
	private boolean estado=false;
	
	public Carro(String marca, String modelo, String cor, String motor, String aroRodas,
			String nmCliente, Date anoFabrica, char tipoCambio, long renavam) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.motor = motor;
		this.aroRodas = aroRodas;
		this.nmCliente = nmCliente;
		this.anoFabrica = anoFabrica;
		this.tipoCambio = tipoCambio;

		this.renavam = renavam;
	}
	public void ligar() {
		if(this.estado) {
			System.out.println("O carro ja est� ligado"); 
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
			System.out.println("O carro ja est� desligado");
		}
	}
	public void acelerar(double valor) {
		if(this.estado) {
			this.velocidade =this.velocidade+valor;		
		    System.out.println("Velocidade alterada: "+this.velocidade);	
		}else {
			System.out.println("O carro n�o est� ligado");
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
			System.out.println("Valor inv�lido");
		}
		else {
			System.out.println("O carro est� parado");
		}
		
	}
	public void showDados() {
		System.out.println(this.aroRodas);
		System.out.println(this.cor);
		System.out.println(this.modelo);
		System.out.println(this.marca);
		System.out.println(this.motor);
		System.out.println(this.renavam);
		System.out.println(this.tipoCambio);
		System.out.println(this.anoFabrica);
		System.out.println(this.nmCliente);

	}
	public void close() {
		System.exit(0);
	}
	
	
	
}

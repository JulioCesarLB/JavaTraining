package br.com.fiap.fabricaVeiculos;

import java.util.Date;

public class Caminhao{
	private String marca, modelo, cor, motor, aroRodas, eixos, nmCliente, tipoCarga, tipoCambio;
	private Date anoFabricacao, anoModelo; 
	private long renavam; 
	private double velocidade,qntCargaSup, qntCargaAbs; 
	private boolean estado=false;
	
	public Caminhao(String marca, String modelo, String cor, String motor, String aroRodas, String eixos,
			String nmCliente, String tipoCarga, String tipoCambio, Date anoFabricacao, Date anoModelo, long renavam,
			double qntCargaSup) {

		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.motor = motor;
		this.aroRodas = aroRodas;
		this.eixos = eixos;
		this.nmCliente = nmCliente;
		this.tipoCarga = tipoCarga;
		this.tipoCambio = tipoCambio;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.renavam = renavam;
		this.qntCargaSup = qntCargaSup;
	}
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
	public void showDados() {
		System.out.println(this.aroRodas);
		System.out.println(this.cor);
		System.out.println(this.modelo);
		System.out.println(this.marca);
		System.out.println(this.motor);
		System.out.println(this.renavam);
		System.out.println(this.tipoCambio);
		System.out.println(this.anoFabricacao);
		System.out.println(this.nmCliente);
		System.out.println(this.eixos);
		System.out.println(this.qntCargaSup);
		System.out.println(this.qntCargaAbs);
		System.out.println(this.tipoCarga);
		System.out.println(this.anoModelo);

	}
	public void carregar(double valor) {
		if(this.qntCargaSup<(this.qntCargaAbs+valor)) {
			System.out.println("Esse valor excede o limite");
		}else {
			if(valor>0) {
				this.qntCargaAbs+=valor;
				System.out.println("Caminhão carregado, peso: "+this.qntCargaAbs);	
			}else {
				System.out.println("Valor inválido");
			}
		}
		
	}
	public void descarregar(double valor) {
		if(valor>this.qntCargaAbs) {
			this.qntCargaAbs=0;
		}else {
			if(valor>0) {
				this.qntCargaAbs-=valor;
				System.out.println("O caminhão foi descarregado, peso: "+this.qntCargaAbs);
			}else {
				System.out.println("Valor inválido");
			}
		}
	}
	public void close() {
		System.exit(0);
	}
	
	
}

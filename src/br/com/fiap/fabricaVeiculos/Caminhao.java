package br.com.fiap.fabricaVeiculos;

import java.util.Date;

public class Caminhao extends Acoes{
	private String marca, modelo, cor, eixos, nmCliente, tipoCarga;
	private Date anoFabricacao, anoModelo; 
	private long renavam; 
	private double qntCargaSup, qntCargaAbs; 
	private Motor motor;
	private Rodas rodas;
	private Cambio cambio;
	
	public Caminhao(String marca, String modelo, String cor, Motor motor, Rodas rodas, String eixos,
			String nmCliente, String tipoCarga, Cambio cambio, Date anoFabricacao, Date anoModelo, long renavam,
			double qntCargaSup) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.motor = motor;
		this.rodas = rodas;
		this.eixos = eixos;
		this.nmCliente = nmCliente;
		this.tipoCarga = tipoCarga;
		this.cambio = cambio;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.renavam = renavam;
		this.qntCargaSup = qntCargaSup;
	}
	public void showDados() {
		System.out.println(this.rodas);
		System.out.println(this.cor);
		System.out.println(this.modelo);
		System.out.println(this.marca);
		System.out.println(this.motor);
		System.out.println(this.renavam);
		System.out.println(this.cambio);
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
	
}

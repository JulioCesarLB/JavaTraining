package br.com.fiap.fabricaVeiculos;

import java.util.Date;

public class Carro {
	private String marca,modelo,cor, motor, aro_rodas, rodas, nm_cliete;
	private Date ano_fabrica;
	private char tipo_cambio;
	private double velocidade;
	private long renavam;
	private boolean estado=false;
	
	public Carro(String marca, String modelo, String cor, String motor, String aro_rodas, String rodas,
			String nm_cliete, Date ano_fabrica, char tipo_cambio, double velocidade, long renavam) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.motor = motor;
		this.aro_rodas = aro_rodas;
		this.rodas = rodas;
		this.nm_cliete = nm_cliete;
		this.ano_fabrica = ano_fabrica;
		this.tipo_cambio = tipo_cambio;
		this.velocidade = velocidade;
		this.renavam = renavam;
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
			this.estado= false;
			System.out.println("Carro desligado");
		}else {
			System.out.println("O carro ja está desligado");
		}
	}
	
	
	
}

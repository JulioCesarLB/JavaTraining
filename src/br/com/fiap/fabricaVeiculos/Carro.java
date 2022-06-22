package br.com.fiap.fabricaVeiculos;

import java.util.Date;

public class Carro extends Acoes{
	private String marca,modelo,cor, nmCliente;
	private int anoFabrica;
	private long renavam;
	private Rodas roda;
	private Motor motor;
	private Cambio cambio;
	
	public Carro(String marca, String modelo, String cor, Motor motor,Rodas roda,
			String nmCliente, int anoFabrica, Cambio cambio, long renavam) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.motor = motor;
		this.nmCliente = nmCliente;
		this.anoFabrica = anoFabrica;
		this.cambio = cambio;
		this.roda = roda;
		this.renavam = renavam;
	}
	public void showDados() {
		System.out.println(this.cor);
		System.out.println(this.modelo);
		System.out.println(this.marca);
		System.out.println(this.motor);
		System.out.println(this.renavam);
		System.out.println(this.cambio);
		System.out.println(this.anoFabrica);
		System.out.println(this.nmCliente);

	}
	public void close() {
		System.exit(0);
	}
	
	
	
}

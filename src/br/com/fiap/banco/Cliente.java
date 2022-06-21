package br.com.fiap.banco;

public class Cliente {
	private String nm_cliente, cpf_cliente;
	
	public Cliente(String nm_cliente, String cpf_cliente) {
		this.nm_cliente = nm_cliente;
		this.cpf_cliente = cpf_cliente;
	}
	
	public String getNm_cliente() {
		return nm_cliente;
	}
	public void setNm_cliente(String nm_cliente) {
		this.nm_cliente = nm_cliente;
	}
	public String getCpf_cliente() {
		return cpf_cliente;
	}
	public void setCpf_cliente(String cpf_cliente) {
		this.cpf_cliente = cpf_cliente;
	}
	
}

package br.com.fiap.banco;

public class ContaPoupanca extends Conta {
	private long nmr_conta_cliente;
	
	public ContaPoupanca(long nmr_conta_cliente, Cliente cliente) {
		super(nmr_conta_cliente,cliente);
		this.nmr_conta_cliente= nmr_conta_cliente;
		
	}

	@Override
	public double consultar() {
		// TODO Auto-generated method stub
		return this.saldo_cliente;
	}
	public void remover(double valor, Conta contapoupan) {
		transferir(valor,contapoupan);
	}
	
}


package br.com.fiap.banco;

public class ContaCorrente extends Conta {
	private long nmr_conta_cliente;
	private Cliente cliente;
	private double saldo_cliente;
	
	public ContaCorrente(long nmr_conta_cliente, Cliente cliente) {
		super(nmr_conta_cliente,cliente);
		this.cliente = cliente;
		this.nmr_conta_cliente= nmr_conta_cliente;
		
	}

	@Override
	public void consultar() {
		// TODO Auto-generated method stub
		System.out.println(saldo_cliente);
	}
	public void investir(double valor, Conta contapoupan) {
		
		transferir(valor,contapoupan);
	}
	
}

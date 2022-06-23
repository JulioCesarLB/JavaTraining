package br.com.fiap.banco;

public abstract class Conta {

	protected long nmr_conta_cliente;
	protected Cliente cliente;
	protected double saldo_cliente;
	
	
	
	public Conta(long nmr_conta_cliente, Cliente cliente) {
		this.cliente = cliente;
		this.nmr_conta_cliente = nmr_conta_cliente;
		
	}
		
	
	// Metodos de ação do cliente
	public abstract double consultar();
	
	public void deposito(double valor) {
		this.saldo_cliente= this.saldo_cliente + valor;

	}
	public boolean transferir(double valor, Conta conta) {
		if(valor<=this.saldo_cliente && valor>0) {
			this.saldo_cliente = this.saldo_cliente - valor;
			conta.deposito(valor);

			return true;
		}else {
			System.out.println("Não é possível sacar esse valor");
			return false;
		}
	}
	public boolean sacar(double valor) {
		if(this.saldo_cliente>=valor && valor>0) {
			this.saldo_cliente=this.saldo_cliente-valor;
			return true;
		}else {
			System.out.println("Não é possível sacar esse valor");
			return false;
		}
	}
	
	public void close() {
		System.exit(0);
	}
	
}

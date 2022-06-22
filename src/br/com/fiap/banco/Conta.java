package br.com.fiap.banco;

public abstract class Conta {

	protected long nmr_conta_cliente;
	protected Cliente cliente;
	protected double saldo_cliente;
	
	
	
	public Conta(long nmr_conta_cliente, Cliente cliente) {
		this.cliente = cliente;
		this.nmr_conta_cliente = nmr_conta_cliente;
		
	}
		
	public double getSaldo() {
		return this.saldo_cliente;
	}
	
	// Metodos de ação do cliente
	public abstract void consultar();
	
	public void deposito(double valor) {
		this.saldo_cliente= this.saldo_cliente + valor;
		System.out.println("Deposito executado");
	}
	public boolean transferir(double valor, Conta conta) {
		if(valor<=this.getSaldo() && valor>0) {
			this.saldo_cliente = this.saldo_cliente - valor;
			conta.deposito(valor);
			System.out.println("Transferecia exectada com sucesso");
			return true;
		}else {
			System.out.println("Não é possível sacar esse valor");
			return false;
		}
	}
	public boolean sacar(double valor) {
		if(getSaldo()>=valor && valor>0) {
			this.saldo_cliente=this.saldo_cliente-valor;
			System.out.println("saque executado");
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

package br.com.fiap.banco;

public class Conta {

	private String nm_cliente, cpf_cliente;

	private long nmr_conta_cliente;
	private Cliente cliente;
	private double saldo_cliente;
	
	
	
	public Conta(long nmr_conta_cliente, Cliente cliente) {
		this.cliente = cliente;
		this.nmr_conta_cliente = nmr_conta_cliente;
		cliente.getNm_cliente();
		
	}
	
	//getters e setters
	
	public long getNmr_conta_cliente() {
		return nmr_conta_cliente;
	}
	public void setNmr_conta_cliente(long nmr_conta_cliente) {
		this.nmr_conta_cliente = nmr_conta_cliente;
	}
	public void setSaldo_cliente(double saldo_cliente) {
		this.saldo_cliente = saldo_cliente;
	}
	
	public double getSaldo() {
		return this.saldo_cliente;
	}
	
	// Metodos de ação do cliente
	public void consultar() {
		System.out.println(this.getSaldo());
	}
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

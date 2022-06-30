package br.com.fiap.banco;

public abstract class Conta {

	protected long nmr_conta_cliente;
	protected Cliente cliente;
	protected double saldo_cliente;
	private static int contador=0;

	public Conta(long nmr_conta_cliente, Cliente cliente) {
		this.cliente = cliente;
		this.nmr_conta_cliente = nmr_conta_cliente;
		contador++;

	}

	// Metodos de ação do cliente
	public abstract double consultar();

	public void deposito(double valor) {
		this.saldo_cliente = this.saldo_cliente + valor;

	}

	public boolean transferir(double valor, Conta conta) throws SaldoInsuficiente, ValorInvalido {
		if (valor <= this.saldo_cliente && valor > 0) {
			this.saldo_cliente = this.saldo_cliente - valor;
			conta.deposito(valor);

			return true;
		} else if (valor < 0) {
			throw new ValorInvalido("Valor Inválido");
		} else {
			throw new SaldoInsuficiente("Saldo Insuficiente");

		}
	}

	public boolean sacar(double valor) throws SaldoInsuficiente, ValorInvalido {
		if (this.saldo_cliente >= valor && valor > 0) {
			this.saldo_cliente = this.saldo_cliente - valor;
			return true;
		} else if (valor < 0) {
			throw new ValorInvalido("Valor Inválido");
		} else {
			throw new SaldoInsuficiente("Saldo Insuficiente");

		}
	}
	public static int exibiContador() {
		return contador;
	}

	public void close() {
		System.exit(0);
	}

}

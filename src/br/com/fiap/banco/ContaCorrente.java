package br.com.fiap.banco;

public class ContaCorrente extends Conta {
	private long nmr_conta_cliente;
	private double saldoInvestimento=0;
	
	public ContaCorrente(long nmr_conta_cliente, Cliente cliente) {
		super(nmr_conta_cliente,cliente);
		this.nmr_conta_cliente= nmr_conta_cliente;
		
	}

	@Override
	public double consultar(){
		// TODO Auto-generated method stub
		return this.saldo_cliente;
	}
	public void investir(double valor, Produto produto) throws SaldoInsuficiente, ValorInvalido {
		
			System.out.println("Saldo CONTACORRENTE: "+consultar());
			if(sacar(valor)) {
				saldoInvestimento+= produto.investir(valor);
				
			}
	
	}
	public void poupanca(double valor, Conta contapoupan) throws SaldoInsuficiente, ValorInvalido {
		transferir(valor,contapoupan);

	}
	public double consultarInvestimento() {
		return saldoInvestimento;
	}
	public void resgate(double valor) {
		if(valor>0 && valor<=this.saldoInvestimento) {
			
			this.saldoInvestimento-=valor;
			deposito(valor);
		}
	}
	
}

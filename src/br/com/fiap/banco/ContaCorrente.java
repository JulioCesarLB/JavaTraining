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
	public void investir(double valor, String tipoInves) {
		
		if(tipoInves.equals("CDB")) {
			System.out.println("Saldo CONTACORRENTE: "+consultar());
			if(sacar(valor)) {
				saldoInvestimento+= valor*(1+0.008);
				System.out.println("Investimento em CDB realizado, valor atual INVESTIMENTO: "+this.saldoInvestimento);
				System.out.println("Valor atual CONTACORRENTE: "+consultar());
			}else {
				System.out.println("Valor inválido");
			}
		
		}else if(tipoInves.equals("LCA")) {
			System.out.println("Saldo CONTACORRENTE: "+consultar());
			if(sacar(valor)) {
				this.saldoInvestimento+= valor*(1+0.07);
				System.out.println("Investimento em LCA realizado, valor atual INVESTIMENTO: "+this.saldoInvestimento);
				System.out.println("Valor atual CONTACORRENTE: "+consultar());

			}else {
				System.out.println("Valor inválido");
			}
		}else if(tipoInves.equals("LCI")) {
			System.out.println("Saldo CONTACORRENTE: "+consultar());
			if(sacar(valor)) {
				this.saldoInvestimento+= valor*(1+0.07);
				System.out.println("Investimento em LCI realizado, valor atual INVESTIMENTO: "+this.saldoInvestimento);
				System.out.println("Valor atual CONTACORRENTE: "+consultar());

			}else {
				System.out.println("Valor inválido");
			}
				
		}
	}
	public void poupanca(double valor, Conta contapoupan) {
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

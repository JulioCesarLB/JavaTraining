package br.com.fiap.banco;

public class Executavel {

		public static void main(String Args[]) {
			Cliente luizao = new Cliente("luizao","46546841351325") ;
			
			ContaCorrente contaLuizao = new ContaCorrente(1,luizao);
			ContaPoupanca contaPoupancaLuizao = new ContaPoupanca(1,luizao);
			
			contaLuizao.deposito(9000);
			System.out.println(contaLuizao.consultar());
			System.out.println(contaPoupancaLuizao.consultar());
			try {
				contaLuizao.poupanca(1000, contaPoupancaLuizao);
			} catch (SaldoInsuficiente e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ValorInvalido e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("--------------------------------");
			System.out.println(contaLuizao.consultar());
			System.out.println(contaPoupancaLuizao.consultar());
			System.out.println("--------------------------------");

			System.out.println(contaLuizao.consultar());
			System.out.println(contaPoupancaLuizao.consultar());
			System.out.println(contaLuizao.consultarInvestimento());
			System.out.println("--------------------------------");
			
			CDB cdb = new CDB();
			LCI lci = new LCI();
			LCA lca = new LCA();
			
			try {
				contaLuizao.investir(-9, cdb);
			} catch (SaldoInsuficiente e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ValorInvalido e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("--------------------------------");
			try {
				contaLuizao.investir(1000, lci);
			} catch (SaldoInsuficiente e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ValorInvalido e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("--------------------------------");
			try {
				contaLuizao.investir(1000, lca);
			} catch (SaldoInsuficiente e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ValorInvalido e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("Saldo: conta corrente: "+contaLuizao.consultar());
			System.out.println("Saldo: conta poupanca: "+contaPoupancaLuizao.consultar());
			System.out.println("Saldo Investimento: conta corrente: "+contaLuizao.consultarInvestimento());
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			
			contaLuizao.resgate(contaLuizao.consultarInvestimento());
			System.out.println("");
			System.out.println("Saldo: conta corrente: "+contaLuizao.consultar());
			System.out.println("Saldo: conta poupanca: "+contaPoupancaLuizao.consultar());
			System.out.println("Saldo Investimento: conta corrente: "+contaLuizao.consultarInvestimento());
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			
			
			try {
				contaPoupancaLuizao.remover(contaPoupancaLuizao.consultar(), contaLuizao);
			} catch (SaldoInsuficiente e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ValorInvalido e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Saldo: conta corrente: "+contaLuizao.consultar());
			System.out.println("Saldo: conta poupanca: "+contaPoupancaLuizao.consultar());
			System.out.println("Saldo Investimento: conta corrente: "+contaLuizao.consultarInvestimento());

			
			System.out.println(Conta.exibiContador());

			
			
		}
		
		
		
	}



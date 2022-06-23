package br.com.fiap.banco;

public class Executavel {

		public static void main(String Args[]) {
			Cliente luizao = new Cliente("luizao","46546841351325") ;
			
			ContaCorrente contaLuizao = new ContaCorrente(1,luizao);
			ContaPoupanca contaPoupancaLuizao = new ContaPoupanca(1,luizao);
			
			contaLuizao.deposito(9000);
			System.out.println(contaLuizao.consultar());
			System.out.println(contaPoupancaLuizao.consultar());
			contaLuizao.poupanca(1000, contaPoupancaLuizao);
			System.out.println("--------------------------------");
			System.out.println(contaLuizao.consultar());
			System.out.println(contaPoupancaLuizao.consultar());
			System.out.println("--------------------------------");

			System.out.println(contaLuizao.consultar());
			System.out.println(contaPoupancaLuizao.consultar());
			System.out.println(contaLuizao.consultarInvestimento());
			System.out.println("--------------------------------");
			
			contaLuizao.investir(1000, "CDB");
			System.out.println("--------------------------------");
			contaLuizao.investir(1000, "LCI");
			System.out.println("--------------------------------");
			contaLuizao.investir(1000, "LCA");
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
			
			
			contaPoupancaLuizao.remover(contaPoupancaLuizao.consultar(), contaLuizao);
			System.out.println("Saldo: conta corrente: "+contaLuizao.consultar());
			System.out.println("Saldo: conta poupanca: "+contaPoupancaLuizao.consultar());
			System.out.println("Saldo Investimento: conta corrente: "+contaLuizao.consultarInvestimento());

			

			
			
		}
		
		
		
	}



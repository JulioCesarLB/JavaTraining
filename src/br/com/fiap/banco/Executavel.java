package br.com.fiap.banco;

public class Executavel {

		public static void main(String Args[]) {
			Cliente luizao = new Cliente("luizao","46546841351325") ;
			
			Conta contaLuizao = new Conta(1,luizao);
			
			System.out.println(contaLuizao.getSaldo());
		}
		
		
		
	}



package br.com.fiap.banco;

public class Executavel {

	public static void main(String[] args) {
		Conta miguel = new Conta("Miguel","cpf do miguel",300);
		Conta luiz = new Conta("Luizão","cpf d luizão",200);
		Conta matheus = new Conta("Matheus","cpf do matheus",100);
		
		System.out.println(miguel.getSaldo());
		System.out.println(luiz.getSaldo());
		System.out.println(matheus.getSaldo());
		
		
		miguel.deposito(700);
		System.out.println(miguel.getSaldo());
		
		
	    miguel.sacar(100);
	    System.out.println(miguel.getSaldo());
	    
	    miguel.transferir(10, matheus);
	    System.out.println(miguel.getSaldo());
	    System.out.println(matheus.getSaldo());
	    
		
		
		
	}

}

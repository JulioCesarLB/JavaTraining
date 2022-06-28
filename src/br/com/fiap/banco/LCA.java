package br.com.fiap.banco;

public class LCA implements Produto{

	@Override
	public double investir(double valor) {
		// TODO Auto-generated method stub
		return  valor*(1+0.07);
	}

}

package br.com.fiap.banco;

public class CDB implements Produto {

	@Override
	public double investir(double valor) {
		// TODO Auto-generated method stub
		
		return  valor*(1+0.008);
	}

}

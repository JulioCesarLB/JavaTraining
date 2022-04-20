package fiap.tokio.logica.aula;

import javax.swing.JOptionPane;

public class Aula05Tipos {
	public static void main (String args[]) {
		
		String nome="Julio";
		float preco = 10.01f, preco2 = (float) 10.99;
		
		JOptionPane.showMessageDialog(null,preco+preco2);
		
		System.out.printf("O Miguel tirou: %.2f \n",preco);
		System.out.format("O Miguel tirou: %.8f \n",preco);
		
		System.out.printf("O %s tirou: %.2f",nome,preco);
		

	
		
		
		
		
	}
}

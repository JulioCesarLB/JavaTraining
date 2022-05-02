package fiap.tokio.exercicio;

import java.util.Random;

import javax.swing.JOptionPane;

public class Aula09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	JOptionPane.showMessageDialog(null, ex4());
	}
	
	public static String ex3() {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número positivo"));
		
		String nums="";
		
		int[] vetor = new int[n];
		Random randomico = new Random();
		
		for(int i=0;i<n;i++) {
			 vetor[i] = randomico.nextInt(100);
		}
		
		for(int i: vetor) {
			nums+=i+" ";
		}
		return nums;
	}
	
	public static String ex4() {
		
		
		return null;
	}

}

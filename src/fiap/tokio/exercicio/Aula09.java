package fiap.tokio.exercicio;

import java.util.Random;

import javax.swing.JOptionPane;

public class Aula09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	JOptionPane.showMessageDialog(null, ex4());
	}
	
	public static String ex3() {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um n�mero positivo"));
		
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
		int menor=0,igual=0, maior=0, alunos = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantos alunos tem na sua sala"));
		double media=0;
		double[] notas = new double[alunos];
		
		for(int i=0; i<alunos; i++) {
			notas[i]= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a nota do aluno "+(i+1)));
			media += notas[i];
		}
		media/=alunos; 
		
		for(double i:notas) {
			if(media>i) {
				menor+=1;
			}else if(media<i) {
				maior+=1;
			}else {
				igual+=1;
			}
		}
		return "M�dia: "+media+
				"\n Notas superiores: "+maior+
				"\n Notas inferiores: "+menor+
				"\n Notas iguais: "+igual;
	}

}

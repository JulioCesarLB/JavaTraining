package fiap.tokio.exercicio;

import javax.swing.JOptionPane;

public class Aula07 {
	public static void main (String[] Args) {
		JOptionPane.showMessageDialog(null,ex7());
	}
	public static int ex5() {
		int maior =0;
		
		for(int i=1;i<=12;i++) {
			int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o "+i+"º número"));
			
			if(maior<num) {
				maior=num;
			}else{
				
			}
		}
		return maior;
	}
	public static String ex6() {
		int num =Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número:"));
		String nums=" ";
		for(int  i=0;i<=num;i++) {
			if(i%2==0) {
				nums+=i+" \n";
			}
		}
		return nums;
	}
	public static String ex7() {
		boolean correct=false;
		int quantidade;
		
		do {
		double realMedia=0, media  = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a Média"));
		quantidade=0;
		
		for(int i =1; i<=20;i++) {
			double nota = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a nota do aluno "+i));	
			realMedia+=nota;
			
			if(nota>media) {
				quantidade+=1;
			}
		}
		
		if((realMedia/20) ==media) {
			correct=true;
		}
		else {
			JOptionPane.showMessageDialog(null,"Opss!!!!","A média não condiz com as notas informadas, tente novamente",JOptionPane.ERROR_MESSAGE);
		}
		
		}while(!correct);
		return quantidade+" alunos tiraram mais que a média e "+(20-quantidade)+" tiraram menos ou igual a média";
	}
}

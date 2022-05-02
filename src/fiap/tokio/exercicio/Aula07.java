package fiap.tokio.exercicio;

import javax.swing.JOptionPane;

public class Aula07 {
	public static void main (String[] Args) {
		JOptionPane.showMessageDialog(null,ex10());
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
	public static int ex8() {
		int num, soma=0;
		do {
			num =Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número positivo inteiro"));
		}while(num<0);
		
		for(int i= 0; i<=num;i++) {
			soma=soma+i;
		}
		
		return soma;
		
	}
	public static String ex9() {
		int num =Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número"));
		String divisores="";
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				divisores=divisores+i+", ";
			}
		}
		
		return divisores;
		
	}
	public static Boolean verificaPrimo(int num) {
		if((num==2) || (num==3) || (num==5) || (num==7)){
			return true;
		}
		
		
		if((num%2==0) || (num%3==0) || (num%5==0) || (num%7==0)) {
			return false;
		}else {
			for(int i =11;i<num;i+=2) {
				if((i%2==0) || (i%3==0) || (i%5==0) || (i%7==0)) {
					continue;
				}else if(num%i==0) {
					return false;
				}
				
			}
			
			return true;
		}
	}
	public static String ex10() {
		int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número"));
		String nums="";
		
		for(int i=2;i<=num;i++) {
			
			if(i%100==0) {
				nums=nums+" \n";
			}
			
			if(verificaPrimo(i)) {
				nums=nums+i+", ";
				
			}
			else {
				
			}
			
		}
		return nums;
		
		
	
	}
}

package fiap.tokio.exercicio;

import java.util.Calendar;
import java.util.Random;

import javax.swing.JOptionPane;

public class Aula08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,ex6());
	}
	public static String ex1() {
		Calendar calendar = Calendar.getInstance();
		int hora= calendar.get(Calendar.HOUR_OF_DAY);
		String name = JOptionPane.showInputDialog(null, "Digite o seu nome");
		
		if(hora>=18) {
			
			return "Boa noite,"+name+" !";
		}
		else if(hora>=12) {
			return "Boa tarde,"+name+" !";
		}
		else if(hora>=6){
			return "Bom dia,"+name+" !";
		}
		else {
			return "Boa madrugada,"+name+" !";
		}
	}
	public static String ex2() {
		Calendar calendar = Calendar.getInstance();
		if(calendar.get(Calendar.DAY_OF_WEEK)==3) {
			
			return "Hoje tem feira hein";
		}else {
			return "Relaxa, hoje não tem feira";
		}
		
	}
	public static String ex3() {
		int maiu=0, minu=0, nume=0, espa=0 ,especial=0;
		String palavra = JOptionPane.showInputDialog(null,"Digite a sua palavra ");
		char letra;
		
		for(int i=0;i<palavra.length();i++) {
			letra = palavra.charAt(i);
			
			if((letra>='A') && (letra<='Z')) {
				maiu+=1;
			}
			else if((letra>='a') && (letra<='z') ) {
				minu+=1;
			}
			else if((letra>='0') && (letra<='9')) {
				nume+=1;
			}
			else if(letra==' ') {
				espa+=1;
			}
			else {
				especial+=1;
			}
		}
		String retorno =" Letras maiusculas: "+maiu+
				"\n Letras minusculas: "+minu+
				"\n Nuúmeros: "+nume+
				"\n Espaços: "+espa+
				"\n Especiais: "+especial;
		return retorno;
	}
	public static double ex4() {
		double x =  Math.sqrt(81);
		
		double y = ((5*x) + (2* Math.pow(x, 2)) + (Math.cbrt(8)) - Math.PI*x)/(Math.pow(3, 4)+x);
		
		return y;
	}
	public static int ex5() {
		int soma=0;
		Random sorteador = new Random();
		
		for(int i =0; i<50;i++) {
			int num =  sorteador.nextInt(45)+5;
			soma+=num;
		}
		
		return soma;
	}
	public static String ex6() {
		Random sorteador = new Random();
		int pares=0,impares=0,primos=0;
		
		for(int i=0; i<100;i++) {
			int num = sorteador.nextInt(100);
			
			if(num%2==0) {
				pares+=1;
			}else {
				impares+=1;
			}
			if(verificaPrimo(num)) {
				primos+=1;
			}
			
		}
		
		return "Némeros pares: "+pares+
				"\n Números impares "+impares+
				"\n Números primos "+primos;
	}
	
	public static boolean verificaPrimo(int num) {
		
		if(num==2 || num==3 || num==5 || num==7) {
			return true;
		}
		
		if(num%2==0 || num%3==0 || num%5==0 || num%7==0) {
			return false;
		}else {
			
			for(int i=11; i<num;i++) {
				if(i%2==0 || i%3==0 || i%5==0 || i%7==0) {
					continue;
				}else {
					if(num%i==0) {
						return false;
					}
				}
			}
			return true;
			
		}
		
		
	}
}

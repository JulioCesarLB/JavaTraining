package fiap.tokio.exercicio;

import javax.swing.JOptionPane;

public class Aula5 {
	public static void main(String Args[]) { 
		ex10();
		
	}
	public static void ex2() {  
		int numInt=10;
		float numFloat=20.98f;
		double numDouble=30.98;
		
		JOptionPane.showMessageDialog(null,"Int: "+numInt
				+"\n Float: "+numFloat
				+"\n Double: "+numDouble);
		
		String fFloat, iInt, dDouble;
		
		iInt =  Integer.toString(numInt);
		fFloat = Float.toString(numFloat);
		dDouble = Double.toString(numDouble);
		
		JOptionPane.showMessageDialog(null,iInt+fFloat+dDouble);
		
	}
	public static void ex3() {  
		
		String name = JOptionPane.showInputDialog(null,"Digite o seu nome:");
		char sex =  JOptionPane.showInputDialog(null,"Qual o seu sexo:"
				+ "\n � [ M ] Masculino"
				+ "\n � [ F ] Feminino"
				+ "\n � [ O ] Outro "
				+ "\n � [ N ] N�o responder").charAt(0);
		
		JOptionPane.showMessageDialog(null, "Ol�, "+name+"! Voc� escolheu a seguinte op��o de g�nero: "+sex);
		
	}
	public static void ex4() {  
		
		int nota1 =Integer.parseInt(JOptionPane.showInputDialog(null, "Digita a nota 1"));
		int nota2 =Integer.parseInt(JOptionPane.showInputDialog(null, "Digita a nota 2"));
		
		double media = ((double)nota1+(double)nota2)/2;
		
		JOptionPane.showMessageDialog(null, media);
		
		
	}
	public static void ex5(){  
		int notaA =(Integer.parseInt(JOptionPane.showInputDialog(null, "Digita a nota A"))*4);
		int notaB =(Integer.parseInt(JOptionPane.showInputDialog(null, "Digita a nota B"))*6);
		
		double media = ((double)notaA+(double)notaB)/10;
		JOptionPane.showMessageDialog(null, media);
		
	}
	public static void ex6() {  
		double finalValor=0;
		
		for(int i=1;i<=2;i++) {
			String peca = JOptionPane.showInputDialog(null,"Digite o nome da pe�a "+i+": ");
			int quant = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de pe�as de"+peca+": "));
			double valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor de "+peca+": "));
			
			finalValor += (double)quant * valor;
			
		}
		JOptionPane.showMessageDialog(null, "O valor final � "+finalValor);
	}
	public static void ex7() {  
		double valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do Produto: "));
		double pago = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor que foi PAGO: "));
		
		double troco = pago - valor;
		
		if(troco>0) {
			System.out.println("Seu troco � de: "+troco);
		}else if(troco<0){
			System.out.println("Voc� esta devendo: "+(troco*-1));
		}else {
			System.out.println("Voc� pagou tudo e n�o possui troco");
		}
		
	}
	public static void ex8() { 
		double valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor em real: "));
				String dolar= String.format("\n � D�lar %.2f",(valor*0.22));
				String euro = String.format("\n � Euro %.2f",(valor*0.20));
				String peso = String.format("\n � Peso argentino %.2f",(valor*24.66));
				String libra = String.format("\n � Libra esterlina %.2f",(valor*0.17));
				String iene = String.format("\n � Iene %.2f",(valor*27.67));
				JOptionPane.showMessageDialog(null,valor+" reais, convertido resultam nos respectivos valores:"+dolar+euro+peso+libra+iene);
		
	}
	public static void ex9() {
		String zero="0",valor = JOptionPane.showInputDialog(null,"Digite o valor at� 999: ");
		
		char centena = (char) zero.charAt(0), dezena= (char) zero.charAt(0), unidade= (char) zero.charAt(0);
		
		if(valor.length()==3) {
			centena = (char) valor.charAt(0);
			dezena = (char) valor.charAt(1);
			unidade = (char) valor.charAt(2);
			
		}else if(valor.length()==2) {
			dezena = (char) valor.charAt(0);
			unidade = (char) valor.charAt(1);
			
		}else {
			unidade = (char) valor.charAt(0);
			
			
		}
		JOptionPane.showMessageDialog(null,"Para o n�mero: "+valor
				+"\n Centena: "+centena+"00"
				+"\n Dezena: "+dezena+"0"
				+"\n Unidade: "+unidade);
		
		
	}
	public static void ex10() {
	int anos = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite quantos anos voc� tem: "));
	int meses = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite quantos meses: "));
	int dias = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite quantos dias: "));
		
	
	JOptionPane.showMessageDialog(null, "Voc� viveu "+((anos*365)+(meses*30)+dias)+" dias");
	}
	
}

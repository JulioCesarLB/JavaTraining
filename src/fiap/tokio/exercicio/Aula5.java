package fiap.tokio.exercicio;

import javax.swing.JOptionPane;

public class Aula5 {
	public static void main(String Args[]) { 
		ex8();
		
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
		JOptionPane.showMessageDialog(null,"Os respectivos valores s�o: "
				+ String.format("\n � D�lar %.2d",(valor*0.22))
				+ String.format("\n � Euro %.2d",(valor*0.20))
				+ String.format("\n � Peso argentino %.2d",(valor*24.66))
				+ String.format("\n � Libra esterlina %.2d",(valor*0.17)
				+ String.format("\n � Iene %.2d",valor*27.67)));
		
		
	}
	
}

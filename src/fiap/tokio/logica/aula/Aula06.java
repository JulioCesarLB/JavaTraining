package fiap.tokio.logica.aula;

public class Aula06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Operadores relacionais
		int num1=90, num2=78;
		boolean test = num1>num2;
		System.out.println(test);
		
		boolean test2 = num1<num2;
		System.out.println(test2);
		
		boolean test3 = num1!=num2;
		System.out.println(test3);
		
		boolean test4 = num1==num2;
		System.out.println(test4);
		
		// Operadores lógicos 
		
		boolean verdadeiro = true, falso = false;
		
		boolean AND = verdadeiro && falso;
		System.out.println(AND);
		
		boolean OR = verdadeiro || falso;
		System.out.println(OR);
		
		boolean NOT = !verdadeiro;
		System.out.println(NOT);
	}

}

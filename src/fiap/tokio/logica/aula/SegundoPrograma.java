package fiap.tokio.logica.aula;

import java.util.Scanner;

public class SegundoPrograma {
	public static void main(String Args[]) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o seu nome");
		String nome = entrada.nextLine();
		
		System.out.println("Ol�, "+nome);
		
		entrada.close();
		
		
	}

}

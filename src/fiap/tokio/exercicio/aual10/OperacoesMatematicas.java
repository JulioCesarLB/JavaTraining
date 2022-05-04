package fiap.tokio.exercicio.aual10;

public class OperacoesMatematicas {
	static double getOPE(char ope, double a, double b) {
		if(ope=='*') {
			return multi(a,b);
		}else if(ope=='/') {
			
			return divi(a,b);
			
		}else if(ope=='+') {
			return mais(a,b);
		}else if(ope=='-') {
			return menos(a,b);
		}else {
			System.out.println("Error");
			return 0;
		}
	}
	private static double menos(double a, double b) {
		double resultado;
		resultado = a-b;
		
		return resultado;
	}
	private static double mais(double a, double b) {
		double resultado;
		
		resultado = a+b;
		
		return resultado;
	}
	private static double divi(double a, double b) {
		double resultado;
		resultado = a/b;
		
		return resultado;
	}
	private static double multi(double a, double b) {
		double resultado;
		resultado = a*b;
		return resultado;
	}
	
}

package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o primeiro valor: ");
		double num1 = entrada.nextDouble();
		
		System.out.print("Digite um operador: ");
		String operador = entrada.next();
		
		System.out.print("Digite o segundo valor: ");
		double num2 = entrada.nextDouble();
		
		Double resultado = "+".equals(operador) ? num1 + num2 : 0;
			   resultado = "-".equals(operador) ? num1 - num2 : resultado;
			   resultado = "*".equals(operador) ? num1 * num2 : resultado;
			   resultado = "/".equals(operador) ? num1 / num2 : resultado;
			   resultado = "%".equals(operador) ? num1 % num2 : resultado;
		
	    String invalido = "ERRO! Valores informados estao invalidos";
	    
		System.out.println(resultado == 0 ? invalido : "Resultado: " + resultado);
		
		entrada.close();
	}
}
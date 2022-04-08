package ExpressoesAritmeticas;

/**Exercícios java -- Expressões aritméticas
 * 
 * @author Claudia Carvalho
 */

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
	
		Scanner leituraNumeros = new Scanner(System.in);

		double numero1;
		System.out.printf("Digite o primeiro número: ");
		numero1 = leituraNumeros.nextInt();
		double numero2;
		System.out.printf("Digite o segundo número: ");
		numero2 = leituraNumeros.nextInt();
		
		boolean resultado = (numero1>numero2 && numero2>numero1);
		
		System.out.println(resultado);

	}
}

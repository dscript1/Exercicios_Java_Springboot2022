package ExpressoesAritmeticas;

/**Exerc�cios java -- Express�es aritm�ticas
 * 
 * @author Claudia Carvalho
 */

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
	
		Scanner leituraNumeros = new Scanner(System.in);

		double numero1;
		System.out.printf("Digite o primeiro n�mero: ");
		numero1 = leituraNumeros.nextInt();
		double numero2;
		System.out.printf("Digite o segundo n�mero: ");
		numero2 = leituraNumeros.nextInt();
		
		boolean resultado = (numero1>numero2 && numero2>numero1);
		
		System.out.println(resultado);

	}
}

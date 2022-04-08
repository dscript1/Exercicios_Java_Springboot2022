package ExpressoesAritmeticas;

/**Exercícios java -- Expressões aritméticas
 * 
 * @author Claudia Carvalho
 */

import java.util.Scanner;

public class exercicio2 {


	public static void main(String[] args) {
		
		Scanner areaCirculo = new Scanner(System.in);
		
		double raio;
		System.out.printf("Insira o valor do raio: ");
		raio = areaCirculo.nextInt();
		
		double calcAreaCirc = (Math.PI * Math.pow(raio,2));
		
		System.out.println("A área do círculo é: " + calcAreaCirc);
		
	}

}

package ExpressoesAritmeticas;

/**Exerc�cios java -- Express�es aritm�ticas
 * 
 * @author Claudia Carvalho
 */

public class exercicio1 {

	public static void main(String[] args) { 
		
		double exp1 = (2 * 8) + (20 - 2);
		double exp2 = ((30 - 25) + 20);
		double exp3 = (3 * (Math.pow(3,2) * 3) );
		double exp4 = 50;
		double exp5 = (11 % 3 * 8);
		double exp6 = (2^4 / 3);
		double exp7 = (3 * 8);
		double exp8 = (5 % 3);
		
		double resultado1 = exp1 - exp2;
		double resultado2 = exp3 / (exp4 - exp5);
		double resultado3 = exp6 + (exp7 / exp8);
		
		System.out.println("O resultado da primeira express�o �: " + resultado1);
		System.out.println("O resultado da segunda express�o �: " + resultado2);
		System.out.println("O resultado da terceira express�o �: " + resultado3);
		
	}
}

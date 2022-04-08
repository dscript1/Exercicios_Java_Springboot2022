package estruturaCondicao;

/**Exercicios java - Estrutura de condição
 * 
 * @author Claudia Carvalho
 */
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner leitorNumero = new Scanner(System.in);
		
		String operadorMatematico = null; 
		System.out.printf("entre com o primeiro número: ");
		double numero1 = leitorNumero.nextDouble();
		System.out.println("Entre com o operador matemático [+, -, / ou *]: ");
		operadorMatematico = leitorNumero.next();

		
		if(operadorMatematico.equalsIgnoreCase("/") || operadorMatematico.equalsIgnoreCase("*") || operadorMatematico.equalsIgnoreCase("+") || operadorMatematico.equalsIgnoreCase("-")); 
				{
			System.out.println("Entre com o segundo número: ");
			double numero2 = leitorNumero.nextDouble();
	
			switch(operadorMatematico) {
			case("/"):
				System.out.printf(".%2d = .%2f" + numero1, numero2 + "= " + (numero1 / numero2));
			break;
			
			case("*"):
				System.out.printf(".%2d = .%2f" + numero1, numero2 + "= " + (numero1 * numero2));
			break;
			
			case("+"):
				System.out.printf(".%2d = .%2f" + numero1, numero2 + "= " + (numero1 + numero2));
			break;
			
			case("-"):
				System.out.printf(".%2d = .%2f" + numero1, numero2 + "= " + (numero1 - numero2));
			break;
				
			default:
				System.out.println("Operador incorreto! Tente novamente.");
				break;
			} 	

		}
		
	}
}

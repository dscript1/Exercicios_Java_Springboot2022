package ExpressoesAritmeticas;

/**Exercícios java -- Expressões aritméticas

 * 
 * @author Claudia Carvalho
 */

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner leituraNome = new Scanner(System.in);
		
	
		System.out.println("Digite o seu nome: ");
		String nome = leituraNome.nextLine();
		System.out.println("Digite o seu sobrenome: ");
		String sobrenome = leituraNome.nextLine();
		
		String nomeCompleto = nome + sobrenome;
	
		System.out.println("Bem vindo(a), " + nomeCompleto);
	}
}

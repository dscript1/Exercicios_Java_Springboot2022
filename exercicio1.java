package estruturaCondicao;

/**Exercicios java - Estrutura de condição
 * 
 * @author Claudia Carvalho
 */

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {

		Scanner leituraDados = new Scanner(System.in); {
		
			System.out.println("Escreva o seu nome: ");
			String nome = leituraDados.nextLine();
			System.out.println("Digite a sua idade: ");
			int idade = leituraDados.nextInt();
			System.out.println("Está habilitado? sim ou nao ");
			String habilitado = leituraDados.nextLine();
			
			final int MAIORIDADE = 18;	
			
System.out.println((idade >= MAIORIDADE && habilitado.equalsIgnoreCase("sim")? "liberação autorizada para " + nome : "o cliente " + nome + " não está autorizado a dirigir"));
		} 
	}
} 

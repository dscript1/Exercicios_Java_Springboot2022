package estruturaCondicao;

/**Exercicios java - Estrutura de condi��o
 * 
 * @author Claudia Carvalho
 */
import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
	

			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite o seu nome: ");
			String nome = sc.nextLine();
			
			System.out.println("Digite o seu sobrenome: ");
			String sobreNome = sc.nextLine();
			
			System.out.printf("Insira o seu RG aqui: ");
			long rg = sc.nextInt();
				
			System.out.println("Bem vindo(a): " + nome + " " + sobreNome);
			System.out.println("Voc� � portador do RG: " + rg + "? sim / nao ");
			
			String validacao = sc.next();
			
			if(validacao.equalsIgnoreCase("sim")) {
			System.out.print("Perfeito! Desconto autorizado! Boas compras!");
			} else if(validacao.equalsIgnoreCase("nao")) {
				System.out.println("Sinto muito! Desconto n�o autorizado, mas pode fazer as compras.");
			}
			else {
				System.out.println("Op��o inv�lida! Tente novamente.");
			}
		}

	}

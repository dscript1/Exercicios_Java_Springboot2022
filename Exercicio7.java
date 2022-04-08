package estruturaCondicao;

import java.time.YearMonth;
import java.util.Scanner;

public class Exercicio7 {

	/**exercicios java - Estrutura de condição;
	 * 
	 * @author Claudia Carvalho
	 */
	
	public static void main(String[] args) {

		Scanner aptoAposentadoriaINSS = new Scanner(System.in);
		
		System.out.println("Bem vindo(a), colaborador(a) da empresa CC! Descubra aqui se você está apto(a) a aposentadoria.");

		final int IDADE_MIN_H = 65;
		final int TEMPO_CONTRIBUICAO_H = 30;
		
		final int IDADE_MIN_M = 60;
		final int TEMPO_CONTRIBUICAO_M = 25;
		
		System.out.println("Digite o seu nome completo: ");
		String nomeCompleto = aptoAposentadoriaINSS.nextLine();
		
		System.out.println("Digite a sua matrícula aqui [somente números inteiros]: ");
		int matriculaColaborador = aptoAposentadoriaINSS.nextInt();
		
		System.out.println("Digite a inicial do seu gênero [M-Masculino | F-Feminino]: ");
		char genero = aptoAposentadoriaINSS.next().charAt(0);
		
		System.out.println("Digite o ano em que você nasceu: ");
		int anoNascimento = aptoAposentadoriaINSS.nextInt();
		
		System.out.println("Digite o ano em que você entrou na empresa: ");
		int anoIngressoEmpresa = aptoAposentadoriaINSS.nextInt();
		
		boolean requerimentoAposentadoria = false;
		
		String generoPorExtenso;
		
		int anoAtual = YearMonth.now().getYear();
		int idade = anoAtual - anoNascimento;
		int tempoTrabalho = anoAtual - anoIngressoEmpresa;
		
		switch (genero)
		{
		
		case 'F':
			generoPorExtenso = "Feminino";
			
			if((idade >= IDADE_MIN_M) && (tempoTrabalho >= TEMPO_CONTRIBUICAO_M))
				requerimentoAposentadoria = true;
			break;
			
		case 'M':
			generoPorExtenso = "Masculino";
			if((idade >= IDADE_MIN_H) && (tempoTrabalho >= TEMPO_CONTRIBUICAO_H))
				requerimentoAposentadoria = true;
			break;	

			default:
				System.out.println("Gênero inválido! Por favor, digite 'F' ou 'M': ");
				System.exit(0);
		}
		
		System.out.println("O(A) Colaborador(a): " + nomeCompleto);
		System.out.println("Cuja matrícula " + matriculaColaborador);
		System.out.println("No ano de " + anoAtual);
		System.out.println("Aos " + idade + "anos");
		System.out.println("Está na empresa há  " + tempoTrabalho + "anos");
		
		if(requerimentoAposentadoria)
			System.out.println("Está apto(a) a se aposentar!");
		else
			System.out.println("Não está apto(a) a se aposentar!");
		
		aptoAposentadoriaINSS.close();
	}
	

}

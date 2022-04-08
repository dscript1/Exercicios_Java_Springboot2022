package estruturaCondicao;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner contaCliente = new Scanner(System.in);
		
		System.out.println("Digite o seu número da conta: ");
		long numeroConta = contaCliente.nextLong();
		System.out.println("O número da sua conta é: " + numeroConta);
		
		System.out.println("Digite o seu saldo: ");
		double saldo = contaCliente.nextDouble();
		System.out.println("Digite o seu débito atual: ");
		double debito = contaCliente.nextDouble();
		System.out.println("Digite o seu crédito atual: ");
		double credito = contaCliente.nextDouble();
		double saldoAtual = saldo + (- debito + credito);
		
		if(saldoAtual >= 0) {
				System.out.println("Saldo positivo é de: " + saldoAtual);
	}
		else {
			System.out.println("Saldo negativo de: " + saldoAtual);
		}
}
}

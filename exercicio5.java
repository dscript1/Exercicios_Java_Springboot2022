package estruturaCondicao;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner contaCliente = new Scanner(System.in);
		
		System.out.println("Digite o seu n�mero da conta: ");
		long numeroConta = contaCliente.nextLong();
		System.out.println("O n�mero da sua conta �: " + numeroConta);
		
		System.out.println("Digite o seu saldo: ");
		double saldo = contaCliente.nextDouble();
		System.out.println("Digite o seu d�bito atual: ");
		double debito = contaCliente.nextDouble();
		System.out.println("Digite o seu cr�dito atual: ");
		double credito = contaCliente.nextDouble();
		double saldoAtual = saldo + (- debito + credito);
		
		if(saldoAtual >= 0) {
				System.out.println("Saldo positivo � de: " + saldoAtual);
	}
		else {
			System.out.println("Saldo negativo de: " + saldoAtual);
		}
}
}

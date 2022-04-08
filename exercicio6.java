package estruturaCondicao;

import java.util.Scanner;

public class exercicio6 {
	
	/**exercicios java - Estrutura de Condição;
	 * 
	 * @author Claudia Carvalho
	 */

	public static void main(String[] args) {

		Scanner litroVendido = new Scanner(System.in);
		
		System.out.println("BEM VINDO(A) AO POSTO TUDO BARATIN!");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Digite a inicial do combustível que deseja abastecer [A-Álcool | G-Gasolina]: ");
		String tipoCombustivel = litroVendido.next();
	
		if(tipoCombustivel.equalsIgnoreCase("A") || tipoCombustivel.equalsIgnoreCase("G"))
			{ System.out.println("Digite a quantidade, em números inteiros, de quantos litros deseja abastecer: ");
			
			double litroInserido = litroVendido.nextDouble();
			
				switch (tipoCombustivel.toUpperCase()) {
				
				case("A"):
					calcular("A", litroInserido);
				break;
				
				case("G"):
					calcular("G", litroInserido);
				break;
				
				}
			} else {
			System.out.println("Opção inválida! Tente novamente!"); }
			}
		
		public static void calcular(String tipoCombustivel, double litroInserido) {
			
			//VALOR ALCOOL
			final double VALOR_LITRO_ALCOOL = 5.34;
			final double DESC_ALCOOL_ATE_20L = 3;
			final double DESC_ALCOOL_MAIOR_20L = 5;
			
			//VALOR GASOLINA
			final double VALOR_LITRO_GASOLINA = 6.18;
			final double DESC_GASOLINA_ATE_20L = 2.6;
			final double DESC_GASOLINA_MAIOR_20L = 4.25;
			
			double descontoAte20;
			double descontoMaiorQue20;
			double valorTotal;
			double descontoTotal;
			double precoLitro;
			
			if(tipoCombustivel.equalsIgnoreCase("A")) {
				
				tipoCombustivel = "Álcool";
				precoLitro = VALOR_LITRO_ALCOOL;
				descontoAte20 = DESC_ALCOOL_ATE_20L;
				descontoMaiorQue20 = DESC_ALCOOL_MAIOR_20L;
			} else {
				tipoCombustivel = "Gasolina";
				precoLitro = VALOR_LITRO_GASOLINA;
				descontoAte20 = DESC_GASOLINA_ATE_20L;
				descontoMaiorQue20 = DESC_GASOLINA_MAIOR_20L;
			}
			
			valorTotal = precoLitro * litroInserido;
			if (litroInserido <= 20) {
				descontoTotal = (valorTotal * descontoAte20) / 100; }
				
				else {
				
				descontoTotal = (valorTotal * descontoMaiorQue20) / 100; }
				
				System.out.println("Combustível selecionado: " + tipoCombustivel);
				System.out.println("Preço por litro: " + precoLitro);
				System.out.println("Litro(s) inserido(s): " + litroInserido);
	
				System.out.printf("Total: %.2f\n", valorTotal);
				System.out.printf("Desconto aplicado: %.2f\n", descontoTotal);
				System.out.printf("Total a pagar: %.2f\n", (valorTotal - descontoTotal));
			}
		}


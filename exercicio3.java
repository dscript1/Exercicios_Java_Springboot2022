package estruturaCondicao;

/**Exercicios java - Estrutura de condição
 * 
 * @author Claudia Carvalho
 */
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a região desejada [Sul, Sudeste, Centro-Oeste, Norte ou Nordeste]: ");
		String regiao = sc.nextLine();
		System.out.print("Insira a temperatura: ");
		float temperatura = sc.nextFloat();
		
		switch(regiao.toUpperCase()) {
		
		case "SUL":
			verificarTemperatura(regiao, temperatura);
			break;
			
		case "SUDESTE":
			verificarTemperatura(regiao, temperatura);
			break;
			
		case "CENTRO-OESTE":
			verificarTemperatura(regiao, temperatura);
			break;
			
		case "NORTE":
			verificarTemperatura(regiao, temperatura);
			break;
			
		case "NORDESTE":
			verificarTemperatura(regiao, temperatura);
			break;
			
		default:
			System.out.println("Região Inválida!");
			break;
		
		}
		
	}
	public static void verificarTemperatura (String regiao, float temperatura) {
		if(temperatura >= 0 && temperatura <= 15) {
			System.out.println("Muito frio na região " + regiao);
		}
		else if (temperatura >= 16 && temperatura <= 20){
			System.out.println("Frio moderado na região " + regiao);
		}
		else if (temperatura >= 21 && temperatura <= 25) {
			System.out.println("Clima moderado na região " + regiao);
		}
		else if (temperatura >= 26 && temperatura <= 35) {
			System.out.println("Clima quente na região " + regiao);
		}
		else {
			System.out.println("Clima muito quente na região " + regiao);		}
	}
}

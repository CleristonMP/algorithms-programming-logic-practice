package estrutura_sequencial;
import java.util.Scanner;
import java.util.Locale;

public class Consumo {
	
	public static void main(String[] args) {
		/* Exerc�cio de Estrutura Sequencial
		 * 
		 * Fazer um programa para ler a dist�ncia total (em km) percorrida por um carro, 
		 * bem como o total de combust�vel gasto por este carro ao percorrer tal dist�ncia. 
		 * Seu programa deve mostrar o consumo m�dio do carro, com tr�s casas decimais.
		 * 
		 * Exemplo 1:
		 * Distancia percorrida: 500
		 * Combust�vel gasto: 38.5
		 * Consumo medio = 12.987
		 * 
		 * Exemplo 2:
		 * Distancia percorrida: 1108
		 * Combust�vel gasto: 71.4
		 * Consumo medio = 15.518 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Distancia percorrida: ");
		int distancia = sc.nextInt();
		System.out.print("Combust�vel gasto: ");
		double combustivel = sc.nextDouble();
		
		double consumo = distancia / combustivel;
		
		System.out.println("Consumo medio = " + String.format("%.3f", consumo));
		
		sc.close();
	}
}
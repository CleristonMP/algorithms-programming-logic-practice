package estrutura_sequencial;
import java.util.Scanner;
import java.util.Locale;

public class Consumo {
	
	public static void main(String[] args) {
		/* Exercício de Estrutura Sequencial
		 * 
		 * Fazer um programa para ler a distância total (em km) percorrida por um carro, 
		 * bem como o total de combustível gasto por este carro ao percorrer tal distância. 
		 * Seu programa deve mostrar o consumo médio do carro, com três casas decimais.
		 * 
		 * Exemplo 1:
		 * Distancia percorrida: 500
		 * Combustível gasto: 38.5
		 * Consumo medio = 12.987
		 * 
		 * Exemplo 2:
		 * Distancia percorrida: 1108
		 * Combustível gasto: 71.4
		 * Consumo medio = 15.518 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Distancia percorrida: ");
		int distancia = sc.nextInt();
		System.out.print("Combustível gasto: ");
		double combustivel = sc.nextDouble();
		
		double consumo = distancia / combustivel;
		
		System.out.println("Consumo medio = " + String.format("%.3f", consumo));
		
		sc.close();
	}
}
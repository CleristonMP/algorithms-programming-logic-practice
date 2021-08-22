package estrutura_sequencial;
import java.util.Scanner;
import java.util.Locale;

public class Troco {
	
	public static void main(String[] args) {
		/* Exercício de Estrutura Sequencial
		 * 
		 * Fazer um programa para calcular o troco no processo de pagamento de um produto 
		 * de uma mercearia. O programa deve ler o preço unitário do produto, 
		 * a quantidade de unidades compradas deste produto, e o valor em dinheiro 
		 * dado pelo cliente (suponha que haja dinheiro suficiente). Seu programa deve 
		 * mostrar o valor do troco a ser devolvido ao cliente. 
		 * 
		 * Exemplo 1:
		 * Preço unitário do produto: 8.00
		 * Quantidade comprada: 2
		 * Dinheiro recebido: 20.00
		 * TROCO = 4.00
		 * 
		 * Exemplo 2:
		 * Preço unitário do produto: 30.00
		 * Quantidade comprada: 3
		 * Dinheiro recebido: 100.00
		 * TROCO = 10.00 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Preço unitário do produto: ");
		double preco = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		int qtd = sc.nextInt();
		System.out.print("Dinheiro recebido: ");
		double dinheiro = sc.nextDouble();
		
		double troco = dinheiro - qtd * preco;
		
		System.out.println("TROCO = " + String.format("%.2f", troco));
		
		sc.close();
	}
}
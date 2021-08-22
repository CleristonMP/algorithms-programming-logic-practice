package estrutura_condicional;
import java.util.Scanner;
import java.util.Locale;

public class TrocoVerificado {
	
	public static void main(String[] args) {
		/* Exercício de Estrutura Condicional
		 * 
		 * Fazer um programa para calcular o troco no processo de pagamento
		 * de um produto de uma mercearia. O programa deve ler o preço unitário do produto, 
		 * a quantidade de unidades compradas deste produto, e o valor em dinheiro 
		 * dado pelo cliente. Seu programa deve mostrar o valor do troco a ser devolvido 
		 * ao cliente. Se o dinheiro dado pelo cliente não for suficiente, 
		 * mostrar uma mensagem informando o valor restante conforme exemplo.
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
		 * Dinheiro recebido: 70.00
		 * DINHEIRO INSUFICIENTE. FALTAM 20.00 REAIS */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtd;
		double preco, dinheiro, troco;
		
		System.out.print("Preço unitário do produto: ");
		preco = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		qtd = sc.nextInt();
		System.out.print("Dinheiro recebido: ");
		dinheiro = sc.nextDouble();
		
		troco = dinheiro - qtd * preco;
		
		if (troco > 0) {
			System.out.println("TROCO = " + String.format("%.2f", troco));
		} else {
			System.out.println("DINHEIRO INSUFICIENTE. FALTAM " + String.format("%.2f", -troco) + " REAIS");
		}
		
		sc.close();
	}
}
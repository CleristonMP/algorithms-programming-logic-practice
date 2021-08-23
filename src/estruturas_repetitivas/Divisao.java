package estruturas_repetitivas;
import java.util.Scanner;
import java.util.Locale;

public class Divisao {
	
	public static void main(String[] args) {
		/* Exercício de Estruturas Repetitivas
		 * 
		 * Escreva um algoritmo que leia dois números e imprima o resultado da divisão 
		 * do primeiro pelo segundo. Caso não seja possível, mostre a mensagem 
		 * “DIVISAO IMPOSSIVEL”.
		 * 
		 * Exemplo:
		 * Quantos casos voce vai digitar? 3
		 * Entre com o numerador: 3
		 * Entre com o denominador: -2
		 * DIVISAO = -1.50
		 * Entre com o numerador: -8
		 * Entre com o denominador: 0
		 * DIVISAO IMPOSSIVEL
		 * Entre com o numerador: 0
		 * Entre com o denominador: 8
		 * DIVISAO = 0.00 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		double divisao;
		
		System.out.print("Quantos casos voce vai digitar? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Entre com o numerador: ");
			x = sc.nextInt();
			System.out.print("Entre com o denominador: ");
			y = sc.nextInt();
			
			if (y == 0) {
				System.out.println("DIVISAO IMPOSSIVEL");
			} else {
			
			divisao = (double) x / y;
			
			System.out.println("DIVISAO = " + String.format("%.2f", divisao));
			
			}			
		}
		
		sc.close();
	}
}
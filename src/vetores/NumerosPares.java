package vetores;
import java.util.Scanner;
import java.util.Locale;

public class NumerosPares {
	
	public static void main(String[] args) {
		/* Exercício com Vetores
		 * 
		 * Faça um programa que leia N números inteiros e armazene-os 
		 * em um vetor. Em seguida, mostre na tela todos os números pares, 
		 * e também a quantidade de números pares.
		 * 
		 * Exemplo:
		 * Quantos numeros voce vai digitar? 6
		 * Digite um numero: 8
		 * Digite um numero: 2
		 * Digite um numero: 11
		 * Digite um numero: 14
		 * Digite um numero: 13
		 * Digite um numero: 20
		 * 
		 * NUMEROS PARES:
		 * 8 2 14 20
		 * 
		 * QUANTIDADE DE PARES = 4 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] vet = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}
		
		System.out.println();
		
		int cont = 0;
		
		System.out.println("NUMEROS PARES:");
		
		for (int i = 0; i < n; i++) {
			if (vet[i] % 2 == 0) {
				System.out.print(vet[i] + " ");
				cont++;
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + cont);
		
		
		sc.close();
	}
}
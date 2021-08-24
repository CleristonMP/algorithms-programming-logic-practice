package vetores;
import java.util.Scanner;
import java.util.Locale;

public class MaiorPosicao {
	
	public static void main(String[] args) {
		/* Exercício com Vetores
		 * 
		 * Faça um programa que leia N números reais e armazene-os em um 
		 * vetor. Em seguida, mostrar na tela o maior número do vetor 
		 * (supor não haver empates). Mostrar também a posição do maior 
		 * elemento, considerando a primeira posição como 0 (zero).
		 * 
		 * Exemplo:
		 * Quanto numeros voce vai digitar? 6
		 * Digite um numero: 8.0
		 * Digite um numero: 4.0
		 * Digite um numero: 10.0
		 * Digite um numero: 14.0
		 * Digite um numero: 13.0
		 * Digite um numero: 7.0
		 * 
		 * MAIOR VALOR = 14.0
		 * POSICAO DO MAIOR VALOR = 3 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quanto numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		
		System.out.println();
		
		double maior = vet[0];
		int posicao = 0;
		
		for (int i = 0; i < n; i++) {
			if (vet[i] > maior) {
				maior = vet[i];
				posicao = i;
			}
		}
		
		System.out.println("MAIOR VALOR = " + String.format("%.1f", maior));
		System.out.println("POSICAO DO MAIOR VALOR = " + posicao);
		
		sc.close();
	}
}
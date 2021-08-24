package vetores;
import java.util.Scanner;
import java.util.Locale;

public class SomaVetor {
	
	public static void main(String[] args) {
		/* Exercício com Vetores
		 * 
		 * Faça um programa que leia N números reais e armazene-os em um 
		 * vetor. Em seguida:
		 * - Imprimir todos os elementos do vetor
		 * - Mostrar na tela a soma e a média dos elementos do vetor
		 * 
		 * Exemplo:
		 * Quantos numeros voce vai digitar? 4
		 * Digite um numero: 8.0
		 * Digite um numero: 4.0
		 * Digite um numero: 10.0
		 * Digite um numero: 14.0
		 * 
		 * VALORES = 8.0 4.0 10.0 14.0
		 * SOMA = 36.00
		 * MEDIA = 9.00 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double soma, media;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		
		System.out.println();
		
		System.out.print("VALORES = ");
		for (int i = 0; i < n; i++) {
			System.out.print(String.format("%.1f", vet[i]) + " ");
		}
		
		System.out.println();
		
		soma = 0;
		for (int i = 0; i < n; i++) {
			soma += vet[i];
		}
		System.out.println("SOMA = " + String.format("%.2f", soma));
		
		media = soma / n;
		System.out.println("MEDIA = " + String.format("%.2f", media));
		
		sc.close();
	}
}
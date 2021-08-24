package vetores;
import java.util.Scanner;
import java.util.Locale;

public class AbaixoDaMedia {
	
	public static void main(String[] args) {
		/* Exercício com Vetores
		 * 
		 * Fazer um programa para ler um número inteiro N e depois um vetor 
		 * de N números reais. Em seguida, mostrar na tela a média 
		 * aritmética de todos elementos com três casas decimais. 
		 * Depois mostrar todos os elementos do vetor que estejam 
		 * abaixo da média, com uma casa decimal cada.
		 * 
		 * Exemplo:
		 * Quantos elementos vai ter o vetor? 4
		 * Digite um numero: 10.0
		 * Digite um numero: 15.5
		 * Digite um numero: 13.2
		 * Digite um numero: 9.8
		 * 
		 * MEDIA DO VETOR = 12.125
		 * ELEMENTOS ABAIXO DA MEDIA:
		 * 10.0
		 * 9.8 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		
		System.out.println();
		
		double soma, media;
		soma = 0;
		
		for (int i = 0; i < n; i++) {
			soma = soma + vet[i];
		}
		media = soma / n;
		
		System.out.println("MEDIA DO VETOR = " + media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		
		for (int i = 0; i < n; i++) {
			if (vet[i] < media) {
				System.out.println(vet[i]);
			}
		}
		
		sc.close();
	}
}
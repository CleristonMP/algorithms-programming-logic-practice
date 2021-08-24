package vetores;
import java.util.Scanner;
import java.util.Locale;

public class MediaPares {
	
	public static void main(String[] args) {
		/* Exercício com Vetores
		 * 
		 * Fazer um programa para ler um vetor de N números inteiros. 
		 * Em seguida, mostrar na tela a média aritmética somente dos 
		 * números pares lidos, com uma casa decimal. Se nenhum número par 
		 * for digitado, mostrar a mensagem "NENHUM NUMERO PAR"
		 * 
		 * Exemplo 1:
		 * Quantos elementos vai ter o vetor? 6
		 * Digite um numero: 8
		 * Digite um numero: 2
		 * Digite um numero: 11
		 * Digite um numero: 14
		 * Digite um numero: 13
		 * Digite um numero: 20
		 * MEDIA DOS PARES = 11.0
		 * 
		 * Exemplo 2:
		 * Quantos elementos vai ter o vetor? 3
		 * Digite um numero: 7
		 * Digite um numero: 9
		 * Digite um numero: 11
		 * NENHUM NUMERO PAR */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] vet = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}
		
		int soma = 0, cont = 0;
		double media;
		
		for (int i = 0; i < n; i++) {
			if (vet[i] % 2 == 0) {
				soma += vet[i];
				cont++;
			}
		}
		media = (double) soma / cont;
		
		if (cont == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			System.out.println("MEDIA DOS PARES = " + String.format("%.1f", media));
		}
			
		sc.close();
	}
}
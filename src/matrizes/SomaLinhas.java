package matrizes;
import java.util.Scanner;
import java.util.Locale;

public class SomaLinhas {
	
	public static void main(String[] args) {
		/* Exercícios com Matrizes
		 * 
		 * Fazer um programa para ler dois números inteiros M e N 
		 * (máximo = 10). Em seguida, ler uma matriz de M linhas e 
		 * N colunas contendo números reais. Gerar um vetor de modo que 
		 * cada elemento do vetor seja a soma dos elementos da linha 
		 * correspondente da matriz. Mostrar o vetor gerado.
		 * 
		 * Exemplo:
		 * Qual a quantidade de linhas da matriz? 2
		 * Qual a quantidade de colunas da matriz? 3
		 * Digite os elementos da 1a. linha:
		 * 7.0
		 * 8.0
		 * 10.0
		 * Digite os elementos da 2a. linha:
		 * 2.0
		 * 3.0
		 * 5.0
		 * VETOR GERADO:
		 * 25.0
		 * 10.0 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a quantidade de linhas da matriz? ");
		int m = sc.nextInt();
		System.out.print("Qual a quantidade de colunas da matriz? ");
		int n = sc.nextInt();
		
		double[][] mat = new double[m][n];
		
		for (int i = 0; i < m; i++) {
			System.out.println("Digite os elementos da " + (i+1) + "a. linha:");
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}
		
		double[] vet = new double[m];
		vet[0] = 0;
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				vet[i] += mat[i][j];
			}
		}
		
		System.out.println("VETOR GERADO:");
		for (int i = 0; i < m; i++) {
			System.out.println(vet[i]);
		}
		
		sc.close();
	}
}
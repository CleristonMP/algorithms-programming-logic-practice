package matrizes;
import java.util.Scanner;
import java.util.Locale;

public class SomaMatrizes {
	
	public static void main(String[] args) {
		/* Exercícios com Matrizes
		 * 
		 * Fazer um programa para ler duas matrizes de números inteiros 
		 * A e B, contendo de M linhas e N colunas cada (M e N máximo = 10).
		 * Depois, gerar uma terceira matriz C onde cada elemento desta é a 
		 * soma dos elementos correspondentes das matrizes originais. 
		 * Imprimir na tela a matriz gerada.
		 * 
		 * Exemplo:
		 * Quantas linhas vai ter cada matriz? 2
		 * Quantas colunas vai ter cada matriz? 3
		 * Digite os valores da matriz A:
		 * Elemento [0,0]: 3
		 * Elemento [0,1]: 5
		 * Elemento [0,2]: 2
		 * Elemento [1,0]: 4
		 * Elemento [1,1]: 5
		 * Elemento [1,2]: 1
		 * Digite os valores da matriz B:
		 * Elemento [0,0]: 2
		 * Elemento [0,1]: 4
		 * Elemento [0,2]: 5
		 * Elemento [1,0]: 1
		 * Elemento [1,1]: 8
		 * Elemento [1,2]: 8
		 * MATRIZ SOMA:
		 * 5 9 7
		 * 5 13 9 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas linhas vai ter cada matriz? ");
		int m = sc.nextInt();
		
		System.out.print("Quantas colunas vai ter cada matriz? ");
		int n = sc.nextInt();
		
		int[][] a = new int[m][n], b = new int[m][n], c = new int[m][n];
		
		System.out.println("Digite os valores da matriz A:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Digite os valores da matriz B:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				b[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("MATRIZ SOMA:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
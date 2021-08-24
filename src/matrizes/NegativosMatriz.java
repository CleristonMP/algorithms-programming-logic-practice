package matrizes;
import java.util.Scanner;
import java.util.Locale;

public class NegativosMatriz {
	
	public static void main(String[] args) {
		/* Exercícios com Matrizes
		 * 
		 * Ler dois números M e N (máximo = 10), e depois ler uma matriz 
		 * MxN de números inteiros, conforme exemplo. Em seguida, mostrar 
		 * na tela somente os números negativos da matriz.
		 * 
		 * Exemplo:
		 * Qual a quantidade de linhas da matriz? 2
		 * Qual a quantidade de colunas da matriz? 3
		 * Elemento [0,0]: 12
		 * Elemento [0,1]: -8
		 * Elemento [0,2]: 5
		 * Elemento [1,0]: -13
		 * Elemento [1,1]: 10
		 * Elemento [1,2]: -6
		 * VALORES NEGATIVOS:
		 * -8
		 * -13
		 * -6 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a quantidade de linhas da matriz? ");
		int m = sc.nextInt();
		
		System.out.print("Qual a quantidade de colunas da matriz? ");
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("VALORES NEGATIVOS:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] < 0) {
					System.out.println(mat[i][j]);
				}
			}
		}
		
		sc.close();
	}
}
package matrizes;
import java.util.Scanner;
import java.util.Locale;

public class AcimaDiagonal {
	
	public static void main(String[] args) {
		/* Exercícios com Matrizes
		 * 
		 * Ler um inteiro N (máximo = 10) e uma matriz quadrada de ordem N
		 * contendo números inteiros. Mostrar a soma dos elementos acima da
		 * diagonal principal. 
		 * 		5 |  2 | 3 | 1
		 * 		8 |  2 | 4 | 5
		 * 		7 |  3 | 1 | 3
		 * 		9 | 12 | 9 | 5
		 * 
		 * Exemplo:
		 * ---------------------------
		 * Entrada
		 * ---------------------------
		 * Qual a ordem da matriz? 4
		 * Elemento [0,0]: 5
		 * Elemento [0,1]: 2
		 * Elemento [0,2]: 3
		 * Elemento [0,3]: 1
		 * Elemento [1,0]: 8
		 * Elemento [1,1]: 2
		 * Elemento [1,2]: 4
		 * Elemento [1,3]: 5
		 * Elemento [2,0]: 7
		 * Elemento [2,1]: 3
		 * Elemento [2,2]: 1
		 * Elemento [2,3]: 3
		 * Elemento [3,0]: 9
		 * Elemento [3,1]: 12
		 * Elemento [3,2]: 9
		 * Elemento [3,3]: 5
		 * SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = 18 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a ordem da matriz? ");
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		int soma = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j > i) {
					soma += mat[i][j];
				}
			}
		}
		
		System.out.println("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = " + soma);
		
		sc.close();
	}
}
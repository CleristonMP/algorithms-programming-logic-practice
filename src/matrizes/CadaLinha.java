package matrizes;
import java.util.Scanner;
import java.util.Locale;

public class CadaLinha {
	
	public static void main(String[] args) {
		/* Exercícios com Matrizes
		 * 
		 * Ler um inteiro N e uma matriz quadrada de ordem N 
		 * (máximo = 10). Mostrar qual o maior elemento de cada linha. 
		 * Suponha não haver empates.
		 * 
		 * Exemplo:
		 * Qual a ordem da matriz? 4
		 * Elemento [0,0]: 5
		 * Elemento [0,1]: -3
		 * Elemento [0,2]: 10
		 * Elemento [0,3]: 8
		 * Elemento [1,0]: 15
		 * Elemento [1,1]: 8
		 * Elemento [1,2]: 2
		 * Elemento [1,3]: 10
		 * Elemento [2,0]: 7
		 * Elemento [2,1]: 9
		 * Elemento [2,2]: -4
		 * Elemento [2,3]: 3
		 * Elemento [3,0]: 8
		 * Elemento [3,1]: -7
		 * Elemento [3,2]: 4
		 * Elemento [3,3]: 13
		 * MAIOR ELEMENTO DE CADA LINHA:
		 * 10
		 * 15
		 * 9
		 * 13 */
		
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
		
		int maior;
		
		System.out.println("MAIOR ELEMENTO DE CADA LINHA:");
		
		for (int i = 0; i < n; i++) {
			maior = 0;
			for (int j = 0; j < n; j++) {
				if (mat[i][j] > maior) {
					maior = mat[i][j];
				}
			}
			System.out.println(maior);
		}
		
		sc.close();
	}
}
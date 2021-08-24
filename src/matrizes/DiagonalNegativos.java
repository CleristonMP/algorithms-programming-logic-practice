package matrizes;
import java.util.Scanner;
import java.util.Locale;

public class DiagonalNegativos {
	
	public static void main(String[] args) {
		/* Exerc�cios com Matrizes
		 * 
		 * Fazer um programa para ler um n�mero inteiro N (m�ximo = 10) 
		 * e uma matriz quadrada de ordem N contendo n�meros inteiros. 
		 * Em seguida, mostrar a diagonal principal e a quantidade de 
		 * valores negativos da matriz.
		 * 
		 * Exemplo:
		 * Qual a ordem da matriz? 3
		 * Elemento [0,0]: 5
		 * Elemento [0,1]: -3
		 * Elemento [0,2]: 10
		 * Elemento [1,0]: 15
		 * Elemento [1,1]: 8
		 * Elemento [1,2]: 2
		 * Elemento [2,0]: 7
		 * Elemento [2,1]: 9
		 * Elemento [2,2]: -4
		 * DIAGONAL PRINCIPAL:
		 * 5 8 -4
		 * QUANTIDADE DE NEGATIVOS = 2 */
		
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
		
		System.out.println("DIAGONAL PRINCIPAL:");
		for (int i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		int cont = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] < 0) {
					cont++;
				}
			}
		}
		System.out.println("QUANTIDADE DE NEGATIVOS = " + cont);
		
		sc.close();
	}
}
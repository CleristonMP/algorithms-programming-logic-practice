package matrizes;
import java.util.Scanner;
import java.util.Locale;

public class MatrizGeral {
	
	public static void main(String[] args) {
		/* Exercícios com Matrizes
		 * 
		 * Ler uma matriz quadrada de ordem N (máximo = 10), contendo 
		 * números reais. Em seguida, fazer as seguintes ações:
		 * a) calcular e imprimir a soma de todos os elementos positivos 
		 * da matriz.
		 * b) fazer a leitura do índice de uma linha da matriz, daí, 
		 * imprimir todos os elementos desta linha.
		 * c) fazer a leitura do índice de uma coluna da matriz, daí, 
		 * imprimir todos os elementos desta coluna.
		 * d) imprimir os elementos da diagonal principal da matriz.
		 * e) alterar a matriz elevando ao quadrado todos os números 
		 * negativos da mesma. Em seguida imprimir a matriz alterada.
		 * 
		 * Exemplo:
		 * Qual a ordem da matriz? 3
		 * Elemento [0,0]: 7.0
		 * Elemento [0,1]: -8.0
		 * Elemento [0,2]: 10.0
		 * Elemento [1,0]: -2.0
		 * Elemento [1,1]: 3.0
		 * Elemento [1,2]: 5.0
		 * Elemento [2,0]: 11.0
		 * Elemento [2,1]: -15.0
		 * Elemento [2,2]: 4.0
		 * 
		 * SOMA DOS POSITIVOS: 40.0
		 * 
		 * Escolha uma linha: 1
		 * LINHA ESCOLHIDA: -2.0 3.0 5.0
		 * 
		 * Escolha uma coluna: 2
		 * COLUNA ESCOLHIDA: 10.0 5.0 4.0
		 * 
		 * DIAGONAL PRINCIPAL: 7.0 3.0 4.0
		 * 
		 * MATRIZ ALTERADA:
		 * 7.0 64.0 10.0
		 * 4.0 3.0 5.0
		 * 11.0 225.0 4.0 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a ordem da matriz? ");
		int n = sc.nextInt();
		
		double[][] mat = new double[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextDouble();
			}
		}
		
		System.out.println();
		
		double soma = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] > 0) {
					soma += mat[i][j];
				}
			}
		}
		
		System.out.println("SOMA DOS POSITIVOS: " + String.format("%.1f", soma));
		System.out.println();
		
		int linha;
		
		System.out.print("Escolha uma linha: ");
		linha = sc.nextInt();
		
		System.out.print("LINHA ESCOLHIDA: ");
		for (int j = 0; j < n; j++) {
			System.out.print(String.format("%.1f", mat[linha][j]) + " ");
		}
		System.out.println();
		System.out.println();
		
		int coluna;
		
		System.out.print("Escolha uma coluna: ");
		coluna = sc.nextInt();
		
		System.out.print("COLUNA ESCOLHIDA: ");
		for (int i = 0; i < n; i++) {
			System.out.print(String.format("%.1f", mat[i][coluna]) + " ");
		}
		System.out.println();
		System.out.println();
		
		System.out.print("DIAGONAL PRINCIPAL: ");
		for (int i = 0; i < n; i++) {
			System.out.print(String.format("%.1f", mat[i][i]) + " ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("MATRIZ ALTERADA:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] < 0) {
					mat[i][j] = Math.pow(mat[i][j], 2);
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(String.format("%.1f", mat[i][j]) + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
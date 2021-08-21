import java.util.Scanner;
import java.util.Locale;

public class matriz_geral {
	
	public static void main(String[] args) {
		
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
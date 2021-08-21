import java.util.Scanner;
import java.util.Locale;

public class soma_matrizes {
	
	public static void main(String[] args) {
		
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
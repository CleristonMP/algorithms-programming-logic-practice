import java.util.Scanner;
import java.util.Locale;

public class soma_linhas {
	
	public static void main(String[] args) {
		
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
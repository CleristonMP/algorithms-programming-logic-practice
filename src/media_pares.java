import java.util.Scanner;
import java.util.Locale;

public class media_pares {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] vet = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}
		
		int soma = 0, cont = 0;
		double media;
		
		for (int i = 0; i < n; i++) {
			if (vet[i] % 2 == 0) {
				soma += vet[i];
				cont++;
			}
		}
		media = (double) soma / cont;
		
		if (cont == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			System.out.println("MEDIA DOS PARES = " + String.format("%.1f", media));
		}
			
		sc.close();
	}
}
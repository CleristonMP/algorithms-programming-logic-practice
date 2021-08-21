import java.util.Scanner;
import java.util.Locale;

public class abaixo_da_media {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		
		System.out.println();
		
		double soma, media;
		soma = 0;
		
		for (int i = 0; i < n; i++) {
			soma = soma + vet[i];
		}
		media = soma / n;
		
		System.out.println("MEDIA DO VETOR = " + media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		
		for (int i = 0; i < n; i++) {
			if (vet[i] < media) {
				System.out.println(vet[i]);
			}
		}
		
		sc.close();
	}
}
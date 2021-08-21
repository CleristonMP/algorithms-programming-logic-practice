import java.util.Scanner;
import java.util.Locale;

public class soma_vetor {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double soma, media;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		
		System.out.println();
		
		System.out.print("VALORES = ");
		for (int i = 0; i < n; i++) {
			System.out.print(String.format("%.1f", vet[i]) + " ");
		}
		
		System.out.println();
		
		soma = 0;
		for (int i = 0; i < n; i++) {
			soma += vet[i];
		}
		System.out.println("SOMA = " + String.format("%.2f", soma));
		
		media = soma / n;
		System.out.println("MEDIA = " + String.format("%.2f", media));
		
		sc.close();
	}
}
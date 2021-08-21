import java.util.Scanner;
import java.util.Locale;

public class maior_posicao {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quanto numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		
		System.out.println();
		
		double maior = vet[0];
		int posicao = 0;
		
		for (int i = 0; i < n; i++) {
			if (vet[i] > maior) {
				maior = vet[i];
				posicao = i;
			}
		}
		
		System.out.println("MAIOR VALOR = " + String.format("%.1f", maior));
		System.out.println("POSICAO DO MAIOR VALOR = " + posicao);
		
		sc.close();
	}
}
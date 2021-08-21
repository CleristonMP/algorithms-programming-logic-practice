import java.util.Scanner;
import java.util.Locale;

public class numeros_pares {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] vet = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}
		
		System.out.println();
		
		int cont = 0;
		
		System.out.println("NUMEROS PARES:");
		
		for (int i = 0; i < n; i++) {
			if (vet[i] % 2 == 0) {
				System.out.print(vet[i] + " ");
				cont++;
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + cont);
		
		
		sc.close();
	}
}
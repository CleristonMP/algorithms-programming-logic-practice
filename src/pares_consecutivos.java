import java.util.Scanner;
import java.util.Locale;

public class pares_consecutivos {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int soma;
		
		System.out.print("Digite um numero inteiro: ");
		int x = sc.nextInt();
		
		while (x != 0) {
			if (x % 2 == 0) {
				soma = 5 * x + 20;
				System.out.println("SOMA = " + soma);
			} else {
				x = x + 1;
				soma = 5 * x + 20;
				System.out.println("SOMA = " + soma);
			}
			System.out.print("Digite um numero inteiro: ");
			x = sc.nextInt();
		}
		
		sc.close();
	}
}
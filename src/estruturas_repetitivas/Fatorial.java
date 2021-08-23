package estruturas_repetitivas;
import java.util.Scanner;
import java.util.Locale;

public class Fatorial {
	
	public static void main(String[] args) {
		/* Exercício de Estruturas Repetitivas
		 * 
		 * Fazer um programa para ler um número natural N (valor máximo: 15), 
		 * depois calcular e mostrar o fatorial de N.
		 * 
		 * Exemplo 1:
		 * Digite o valor de N: 4
		 * FATORIAL = 24
		 * 
		 * Exemplo 2:
		 * Digite o valor de N: 0
		 * FATORIAL = 1
		 * 
		 * Exemplo 3:
		 * Digite o valor de N: 6
		 * FATORIAL = 720
		 * 
		 * Exemplo 4:
		 * Digite o valor de N: 1
		 * FATORIAL = 1 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int fat;
		
		System.out.print("Digite o valor de N: ");
		int n = sc.nextInt();
		
		fat = 1;
		if (n != 0) {
			for (int i = 0; i < n; i++) {
				fat = fat * (n - i);
			}
		}
		
		if (n == 0) {
			System.out.println("FATORIAL = 1");
		} else {
			System.out.println("FATORIAL = " + fat);
		}
		
		sc.close();
	}
}
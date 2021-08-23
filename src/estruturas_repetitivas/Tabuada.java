package estruturas_repetitivas;
import java.util.Scanner;
import java.util.Locale;

public class Tabuada {
	
	public static void main(String[] args) {
		/* Exercício de Estruturas Repetitivas
		 * 
		 * Ler um número inteiro N, daí mostrar na tela a tabuada de N para 1 a 10, 
		 * conforme exemplo.
		 * 
		 * Exemplo:
		 * Deseja a tabuada para qual valor? 4
		 * 4 x 1 = 4
		 * 4 x 2 = 8
		 * 4 x 3 = 12
		 * 4 x 4 = 16
		 * 4 x 5 = 20
		 * 4 x 6 = 24
		 * 4 x 7 = 28
		 * 4 x 8 = 32
		 * 4 x 9 = 36
		 * 4 x 10 = 40 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Deseja a tabuada para qual valor? ");
		n = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			int mult = n * i;
			System.out.println(n + " x " + i + " = " + mult);
		}
		
		sc.close();
	}
}
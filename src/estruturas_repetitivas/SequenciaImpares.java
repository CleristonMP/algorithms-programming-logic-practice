package estruturas_repetitivas;
import java.util.Scanner;
import java.util.Locale;

public class SequenciaImpares {
	
	public static void main(String[] args) {
		/* Exercício de Estruturas Repetitivas
		 * 
		 * Leia um valor inteiro X. Em seguida mostre os ímpares de 1 até X, 
		 * um valor por linha, inclusive o X, se for o caso.
		 * 
		 * Exemplo:
		 * Digite o valor de X: 8
		 * 1
		 * 3
		 * 5
		 * 7 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.print("Digite o valor de X: ");
		x = sc.nextInt();
		
		for (int i = 0; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}
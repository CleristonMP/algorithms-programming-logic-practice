package estruturas_repetitivas;
import java.util.Scanner;
import java.util.Locale;

public class ParImpar {
	
	public static void main(String[] args) {
		/* Exercício de Estruturas Repetitivas
		 * 
		 * Leia um valor inteiro N. Este valor será a quantidade de números inteiros 
		 * que serão lidos em seguida. Para cada valor lido, mostre uma mensagem dizendo 
		 * se este valor lido é PAR ou IMPAR, e também se é POSITIVO ou NEGATIVO. 
		 * No caso do valor ser igual a zero (0), seu programa deverá imprimir apenas NULO.
		 * 
		 * Exemplo:
		 * Quantos numeros voce vai digitar? 4
		 * Digite um numero: -5
		 * IMPAR NEGATIVO
		 * Digite um numero: 0
		 * NULO
		 * Digite um numero: 3
		 * IMPAR POSITIVO
		 * Digite um numero: -4
		 * PAR NEGATIVO */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			x = sc.nextInt();
			
			if(x > 0 && x % 2 == 0) {
				System.out.println("PAR POSITIVO");
			} else if (x < 0 && x % 2 == 0) {
				System.out.println("PAR NEGATIVO");
			} else if (x > 0 && x % 2 != 0) {
				System.out.println("IMPAR POSITIVO");
			} else if (x < 0 && x % 2 != 0) {
				System.out.println("IMPAR NEGATIVO");
			} else {
				System.out.println("NULO");
			}
		}
		
		sc.close();
	}
}
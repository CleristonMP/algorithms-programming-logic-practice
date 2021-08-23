package estrutura_condicional;
import java.util.Scanner;
import java.util.Locale;

public class Multiplos {
	
	public static void main(String[] args) {
		/* Exercício de Estrutura Condicional
		 * 
		 * Fazer um programa para ler dois números inteiros e dizer se um número 
		 * é múltiplo do outro. Os números podem ser digitados em qualquer ordem.
		 * 
		 * Exemplo 1:
		 * Digite dois numeros inteiros:
		 * 6
		 * 24
		 * Sao multiplos
		 * 
		 * Exemplo 2:
		 * Digite dois numeros inteiros:
		 * 24
		 * 6
		 * Sao multiplos 
		 * 
		 * Exemplo 3:
		 * Digite dois numeros inteiros:
		 * 13
		 * 5
		 * Nao sao multiplos */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Digite dois numeros inteiros:");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if (x % y == 0 || y % x == 0) {
			System.out.println("Sao multiplos");
		} else {
			System.out.println("Nao sao multiplos");
		}
		
		sc.close();
	}
}
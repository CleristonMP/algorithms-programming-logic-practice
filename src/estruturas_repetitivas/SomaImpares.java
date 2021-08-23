package estruturas_repetitivas;
import java.util.Scanner;
import java.util.Locale;

public class SomaImpares {
	
	public static void main(String[] args) {
		/* Exercício de Estruturas Repetitivas
		 * 
		 * Leia 2 valores inteiros X e Y (em qualquer ordem). 
		 * A seguir, calcule e mostre a soma dos números impares entre eles.
		 * 
		 * Exemplo 1:
		 * Digite dois numeros:
		 * 2
		 * 9
		 * SOMA DOS IMPARES = 15
		 * 
		 * Exemplo 2:
		 * Digite dois numeros:
		 * 15
		 * 10
		 * SOMA DOS IMPARES = 24
		 * 
		 * Exemplo 3:
		 * Digite dois numeros:
		 * 6
		 * -5
		 * SOMA DOS IMPARES = 5 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y, troca, soma;
		
		System.out.println("Digite dois numeros:");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if (x > y) {
			troca = x;
			x = y;
			y = troca;
		}
		
		soma = 0;
		for (int i = x+1; i < y; i++) {
			if (i % 2 != 0) {
				soma += i;
			}
		}
		
		System.out.println("SOMA DOS IMPARES = " + soma);
		
		sc.close();
	}
}
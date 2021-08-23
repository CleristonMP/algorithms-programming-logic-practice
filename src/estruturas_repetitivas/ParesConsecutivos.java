package estruturas_repetitivas;
import java.util.Scanner;
import java.util.Locale;

public class ParesConsecutivos {
	
	public static void main(String[] args) {
		/* Exerc�cio de Estruturas Repetitivas
		 * 
		 * O programa deve ler um valor inteiro X indefinidas vezes. 
		 * (O programa ir� parar quando o valor de X for igual a 0). 
		 * Para cada X lido, imprima a soma dos 5 pares consecutivos a partir de X, 
		 * inclusive o X, se for par. Se o valor de entrada for 4, por exemplo, 
		 * a sa�da deve ser 40, que � o resultado da opera��o: 4+6+8+10+12, 
		 * enquanto que se o valor de entrada for 11, por exempo, a sa�da deve ser 80, 
		 * que � a soma de 12+14+16+18+20.
		 * 
		 * Exemplo:
		 * Digite um numero inteiro: 4
		 * SOMA = 40
		 * Digite um numero inteiro: 11
		 * SOMA = 80
		 * Digite um numero inteiro: 0 */
		
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
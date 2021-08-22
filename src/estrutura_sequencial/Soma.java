package estrutura_sequencial;
import java.util.Scanner;
import java.util.Locale;

public class Soma {
	
	public static void main(String[] args) {
		/* Exercício de Estrutura Sequencial
		 * 
		 * Fazer um programa para ler dois valores inteiros X e Y, 
		 * depois mostrar na tela o valor da soma destes números.
		 *  
		 * Exemplo 1:
		 * Digite o valor de X: 8
		 * Digite o valor de Y: 10
		 * SOMA = 18
		 *  
		 * Exemplo 2:
		 * Digite o valor de X: 12
		 * Digite o valor de Y: 31
		 * SOMA = 43 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de X: ");
		int x = sc.nextInt();
		System.out.print("Digite o valor de Y: ");
		int y = sc.nextInt();
		
		int soma = x + y;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
	}
}
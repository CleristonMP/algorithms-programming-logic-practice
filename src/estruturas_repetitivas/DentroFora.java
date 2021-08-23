package estruturas_repetitivas;
import java.util.Scanner;
import java.util.Locale;

public class DentroFora {
	
	public static void main(String[] args) {
		/* Exercício de Estruturas Repetitivas
		 * 
		 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X 
		 * que serão lidos em seguida. Mostre quantos destes valores X estão dentro 
		 * do intervalo [10,20] e quantos estão fora do intervalo, conforme exemplo.
		 * 
		 * Exemplo:
		 * Quantos numeros voce vai digitar? 5
		 * Digite um numero: 14
		 * Digite um numero: 35
		 * Digite um numero: 10
		 * Digite um numero: 131
		 * Digite um numero: 8
		 * 2 DENTRO
		 * 3 FORA */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, dentro, fora;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		dentro = 0;
		fora = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			x = sc.nextInt();
			
			if(x >= 10 && x <= 20) {
				dentro++;
			} else {
				fora++;
			}
		}
		
		System.out.println(dentro + " DENTRO");
		System.out.println(fora + " FORA");
		
		sc.close();
	}
}
package estruturas_repetitivas;
import java.util.Scanner;
import java.util.Locale;

public class MediaPonderada {
	
	public static void main(String[] args) {
		/* Exercício de Estruturas Repetitivas
		 * 
		 * Leia um valor inteiro N, que representa o número de casos de teste 
		 * que vem a seguir. Cada caso de teste consiste de 3 valores reais, 
		 * para os quais você deverá calcular e mostrar a média ponderada, sendo que 
		 * o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor 
		 * tem peso 5. Vale lembrar que a média ponderada é a soma de todos os valores 
		 * multiplicados pelo seu respectivo peso, dividida pela soma dos pesos.
		 * 
		 * Exemplo:
		 * Quantos casos voce vai digitar? 3
		 * Digite tres numeros:
		 * 6.5
		 * 4.3
		 * 6.2
		 * MEDIA = 5.7
		 * Digite tres numeros:
		 * 5.1
		 * 4.2
		 * 8.1
		 * MEDIA = 6.3
		 * Digite tres numeros:
		 * 8.0
		 * 9.0
		 * 10.0
		 * MEDIA = 9.3 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y, z, mediaPond;
		
		System.out.print("Quantos casos voce vai digitar? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite tres numeros:");
			x = sc.nextDouble();
			y = sc.nextDouble();
			z = sc.nextDouble();
			
			mediaPond = (x * 2 + y * 3 + z * 5) / 10.0;
			
			System.out.println("MEDIA = " + String.format("%.1f", mediaPond));
			
		}
		
		sc.close();
	}
}
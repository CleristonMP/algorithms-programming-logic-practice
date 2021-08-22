package estrutura_sequencial;
import java.util.Scanner;
import java.util.Locale;

public class Medidas {
	
	public static void main(String[] args) {
		/* Exercício de Estrutura Sequencial
		 * 
		 * Fazer um programa para ler três medidas A, B e C. 
		 * Em seguida, calcular e mostrar (imprimir os dados com quatro casas decimais):
		 * a) a área do quadrado que tem lado A.
		 * b) a área do triângulo retângulo que base A e altura B.
		 * c) a área do trapézio que tem bases A e B, e altura C.
		 * 
		 * Exemplo 1:
		 * Digite a medida A: 4.0
		 * Digite a medida B: 3.5
		 * Digite a medida C: 5.2
		 * AREA DO QUADRADO = 16.0000
		 * AREA DO TRIANGULO = 7.0000
		 * AREA DO TRAPEZIO = 19.5000
		 * 
		 * Exemplo 2:
		 * Digite a medida A: 7.13
		 * Digite a medida B: 8.05
		 * Digite a medida C: 11.912
		 * AREA DO QUADRADO = 50.8369
		 * AREA DO TRIANGULO = 28.6983
		 * AREA DO TRAPEZIO = 90.4121 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a medida A: ");
		double a = sc.nextDouble();
		System.out.print("Digite a medida B: ");
		double b = sc.nextDouble();
		System.out.print("Digite a medida C: ");
		double c = sc.nextDouble();
		
		double areaQuad, areaTri, areaPezio;
		
		areaQuad = Math.pow(a, 2);
		areaTri = (a * b) / 2.0;
		areaPezio = (a + b) * c / 2.0;
		
		System.out.println("AREA DO QUADRADO = " + String.format("%.4f", areaQuad));
		System.out.println("AREA DO TRIANGULO = " + String.format("%.4f", areaTri));
		System.out.println("AREA DO TRAPEZIO = " + String.format("%.4f", areaPezio));
		
		sc.close();
	}
}
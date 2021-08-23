package estruturas_repetitivas;
import java.util.Scanner;
import java.util.Locale;

public class Quadrante {
	
	public static void main(String[] args) {
		/* Exercício de Estruturas Repetitivas
		 * 
		 * Escreva um programa para ler as coordenadas (X,Y) 
		 * de uma quantidade indeterminada de pontos no sistema cartesiano. 
		 * Para cada ponto escrever o quadrante a que ele pertence (Q1, Q2, Q3 ou Q4). 
		 * O algoritmo será encerrado quando pelo menos uma de duas coordenadas 
		 * for NULA (nesta situação sem escrever mensagem alguma).
		 * 
		 * Exemplo:
		 * Digite os valores das coordenadas X e Y:
		 * 2
		 * 2
		 * QUADRANTE Q1
		 * Digite os valores das coordenadas X e Y:
		 * 3
		 * -2
		 * QUADRANTE Q4
		 * Digite os valores das coordenadas X e Y:
		 * -8
		 * -1
		 * QUADRANTE Q3
		 * Digite os valores das coordenadas X e Y:
		 * -7
		 * 1
		 * QUADRANTE Q2
		 * Digite os valores das coordenadas X e Y:
		 * 0
		 * 2 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		
		System.out.println("Digite os valores das coordenadas X e Y:");
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("QUADRANTE Q1");
			} else if (x < 0 && y > 0) {
				System.out.println("QUADRANTE Q2");
			} else if (x < 0 && y < 0) {
				System.out.println("QUADRANTE Q3");
			} else {
				System.out.println("QUADRANTE Q4");
			}
			System.out.println("Digite os valores das coordenadas X e Y:");
			x = sc.nextDouble();
			y = sc.nextDouble();
		}
		
		sc.close();
	}
}
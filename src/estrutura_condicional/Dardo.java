package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Dardo {

	public static void main(String[] args) {
		/* Exercício de Estrutura Condicional
		 * 
		 * No arremesso de dardo, o atleta tem três chances para lançar o dardo à maior 
		 * distância que conseguir. Você deve criar um programa para, dadas as medidas 
		 * das três tentativas de lançamento, informar qual foi a maior.
		 * 
		 * Exemplo 1:
		 * Digite as tres distancias:
		 * 83.21
		 * 79.53
		 * 89.15
		 * MAIOR DISTANCIA = 89.15
		 * 
		 * Exemplo 2:
		 * Digite as tres distancias:
		 * 83.21
		 * 87.20
		 * 83.21
		 * MAIOR DISTANCIA = 87.20 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double maior, d1, d2, d3;
		
		System.out.println("Digite as tres distancias:");
		d1 = sc.nextDouble();
		d2 = sc.nextDouble();
		d3 = sc.nextDouble();
		
		if (d1 > d2 && d1 > d3) {
			maior = d1;
		} else if (d2 > d3) {
			maior = d2;
		} else {
			maior = d3;
		}
		System.out.printf("MAIOR DISTANCIA = %.2f", maior);
		
		sc.close();
	}

}

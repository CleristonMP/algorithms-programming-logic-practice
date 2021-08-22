package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		/* Exercício de Estrutura Condicional
		 * 
		 * Deseja-se converter uma medida de temperatura da escala Celsius para Fahrenheit 
		 * ou vice-versa. Para isso, você deve construir um programa que leia a letra "C" 
		 * ou "F" indicando em qual escala vai ser informada uma temperatura. 
		 * Em seguida o programa deve mostrar a temperatura na outra escala com duas casas 
		 * decimais. A seguir é dada a fórmula para converter de Fahrenheit para Celsius 
		 * (você deve deduzir a fórmula de Celsius para Fahrenheit): C = 5/9 * (F - 32) 
		 * 
		 * Exemplo 1:
		 * Voce vai digitar a temperatura em qual escala (C/F)? F
		 * Digite a temperatura em Fahrenheit: 75.00
		 * Temperatura equivalente em Celsius: 23.89
		 * 
		 * Exemplo 2:
		 * Voce vai digitar a temperatura em qual escala (C/F)? C
		 * Digite a temperatura em Celsius: 28.15
		 * Temperatura equivalente em Fahrenheit: 82.67 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
		char escala = sc.next().charAt(0);
		double temp, result;
		
		if (escala == 'F') {
			System.out.print("Digite a temperatura em Fahrenheit: ");
			temp = sc.nextDouble();
			result = (temp - 32) * 5/9;
			System.out.printf("Temperatura equivalente em Celsius: %.2f", result);
		} else if (escala == 'C') {
			System.out.print("Digite a temperatura em Celsius: ");
			temp = sc.nextDouble();
			result =  (temp * 9/5) + 32;
			System.out.printf("Temperatura equivalente em Fahrenheit: %.2f", result);
		} else {
			System.out.println("Escala inválida");
		}
		
		
		
		sc.close();
	}

}

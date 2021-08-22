package estrutura_condicional;
import java.util.Scanner;
import java.util.Locale;

public class Bhaskara {
	
	public static void main(String[] args) {
		/* Exercício de Estrutura Condicional
		 * 
		 * Fazer um programa para ler os três coeficientes de uma equação do segundo grau. 
		 * Usando a fórmula de Baskara, calcular e mostrar os valores das raízes x1 e x2 
		 * da equação com quatro casas decimais, conforme exemplo. 
		 * Se a equação não possuir raízes reais, mostrar uma mensagem.
		 * 
		 * Exemplo 1:
		 * Coeficiente a: 1
		 * Coeficiente b: 0
		 * Coeficiente c: -9
		 * X1 = 3.0000
		 * X2 = -3.0000
		 * 
		 * Exemplo 2:
		 * Coeficiente a: 2
		 * Coeficiente b: -4.5
		 * Coeficiente c: 1.7
		 * X1 = 1.7697
		 * X2 = 0.4803 
		 * 
		 * Exemplo 3:
		 * Coeficiente a: 1
		 * Coeficiente b: 3
		 * Coeficiente c: 4
		 * Esta equacao nao possui raizes reais*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, delta, x1, x2;
		
		System.out.print("Coeficiente a: ");
		a = sc.nextDouble();
		System.out.print("Coeficiente b: ");
		b = sc.nextDouble();
		System.out.print("Coeficiente c: ");
		c = sc.nextDouble();
		
		delta = Math.pow(b,2) - 4 * a * c;
		
		if (delta < 0 || a == 0) {
			System.out.println("Esta equacao nao possui raizes reais");
		} else {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("X1 = " + String.format("%.4f", x1));
			System.out.println("X2 = " + String.format("%.4f", x2));
		}
		
		sc.close();
	}
}
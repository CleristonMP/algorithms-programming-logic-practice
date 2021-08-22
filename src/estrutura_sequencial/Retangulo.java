package estrutura_sequencial;
import java.util.Scanner;
import java.util.Locale;

public class Retangulo {
	
	public static void main(String[] args) {
		/* Exercício de Estrutura Sequencial
		 * 
		 * Fazer um programa para ler as medidas da base e altura de um retângulo. 
		 * Em seguida, mostrar o valor da área, perímetro e diagonal deste retângulo, 
		 * com quatro casas decimais, conforme exemplos.
		 * 
		 * Exemplo 1:
		 * Base do retangulo: 4.0
		 * Altura do retangulo: 5.0
		 * AREA = 20.0000
		 * PERIMETRO = 18.0000
		 * DIAGONAL = 6.4031 
		 * 
		 * Exemplo 2:
		 * Base do retangulo: 10.3
		 * Altura do retangulo: 13.1
		 * AREA = 134.9300
		 * PERIMETRO = 46.8000
		 * DIAGONAL = 16.6643 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Base do retangulo: ");
		double base = sc.nextDouble();
		System.out.print("Altura do retangulo: ");
		double altura = sc.nextDouble();
		
		double area = base * altura;
		double perimetro = 2.0 * (base + altura);
		double diagonal = Math.sqrt( Math.pow(base, 2) + Math.pow(altura, 2) );
		
		System.out.println("AREA = " + String.format("%.4f", area));
		System.out.println("PERIMETRO = " + String.format("%.4f", perimetro));
		System.out.println("DIAGONAL = " + String.format("%.4f", diagonal));
		
		sc.close();
	}
}

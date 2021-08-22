package estrutura_sequencial;
import java.util.Scanner;
import java.util.Locale;

public class Circulo {
	
	public static void main(String[] args) {
		/* Exercício de Estrutura Sequencial
		 * 
		 * Fazer um programa para ler o valor "r" do raio de um círculo, 
		 * depois mostrar o valor da área do círculo com três casas decimais. 
		 * A fórmula da área do círculo é a seguinte: 𝑎𝑟𝑒𝑎 = 𝜋. 𝑟². 
		 * Você pode usar o valor de 𝜋 fornecido pela biblioteca da sua 
		 * linguagem de programação, ou então, se preferir, 
		 * use diretamente o valor 3.14159.
		 * 
		 * Exemplo 1:
		 * Digite o valor do raio do circulo: 2.0
		 * AREA = 12.566
		 * 
		 * Exemplo 2:
		 * Digite o valor do raio do circulo: 13.2
		 * AREA = 547.391 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do raio do circulo: ");
		double raio = sc.nextDouble();
		
		double area = 3.14159 * Math.pow(raio, 2);
		
		System.out.println("AREA = " + String.format("%.3f", area));
		
		sc.close();
	}
}
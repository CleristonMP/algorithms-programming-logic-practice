package vetores;
import java.util.Scanner;
import java.util.Locale;

public class DadosPessoas {
	
	public static void main(String[] args) {
		/* Exercício com Vetores
		 * 
		 * Tem-se um conjunto de dados contendo a altura e o gênero (M, F) 
		 * de N pessoas. Fazer um program que calcule e escreva a maior 
		 * e a menor altura do grupo, a média de altura das mulheres, 
		 * e o número de homens.
		 * 
		 * Exemplo:
		 * Quantas pessoas serao digitadas? 5
		 * Altura da 1a pessoa: 1.70
		 * Genero da 1a pessoa: F
		 * Altura da 2a pessoa: 1.83
		 * Genero da 2a pessoa: M
		 * Altura da 3a pessoa: 1.54
		 * Genero da 3a pessoa: M
		 * Altura da 4a pessoa: 1.61
		 * Genero da 4a pessoa: F
		 * Altura da 5a pessoa: 1.75
		 * Genero da 5a pessoa: F
		 * Menor altura = 1.54
		 * Maior altura = 1.83
		 * Media das alturas das mulheres = 1.69
		 * Numero de homens = 2 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		double[] altura = new double[n];
		char[] genero = new char[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Altura da " + (i+1) + "a pessoa: ");
			altura[i] = sc.nextDouble();
			System.out.print("Genero da " + (i+1) + "a pessoa: ");
			genero[i] = sc.next().charAt(0);
		}
		
		double menor = altura[0], maior = altura[0], media, soma = 0;
		int contF = 0, contM = 0;
		
		for (int i = 0; i < n; i++) {
			if (altura[i] < menor) {
				menor = altura[i];
			}
		}
		
		for (int i = 0; i < n; i++) {
			if (altura[i] > maior) {
				maior = altura[i];
			}
		}
		
		for (int i = 0; i < n; i++) {
			if (genero[i] == 'F') {
				contF++;
				soma += altura[i];
			}
		}
		media = soma / contF;
		
		for (int i = 0; i < n; i++) {
			if (genero[i] == 'M') {
				contM++;
			}
		}
		
		System.out.println("Menor altura = " + String.format("%.2f", menor));
		System.out.println("Maior altura = " + String.format("%.2f", maior));
		System.out.println("Media das alturas das mulheres = " + String.format("%.2f", media));
		System.out.println("Numero de homens = " + contM);
		
		sc.close();
	}
}
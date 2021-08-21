import java.util.Scanner;
import java.util.Locale;

public class dados_pessoas {
	
	public static void main(String[] args) {
		
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
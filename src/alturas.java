import java.util.Scanner;
import java.util.Locale;

public class alturas {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double soma, media, porcento;
		int cont;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
		}
		
		System.out.println();
		
		soma = 0;
		for (int i = 0; i < n; i++) {
			soma = soma + altura[i];
		}
		media = soma / n;
		System.out.println("Altura média: " + String.format("%.2f", media));
		
		cont = 0;
		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				cont++;
			}
		}
		porcento = 100.0 * cont / n;
		System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f", porcento) + "%");
		
		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}
		
		sc.close();
	}
}
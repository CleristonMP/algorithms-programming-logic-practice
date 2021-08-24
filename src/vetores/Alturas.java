package vetores;
import java.util.Scanner;
import java.util.Locale;

public class Alturas {
	
	public static void main(String[] args) {
		/* Exercício com Vetores
		 * 
		 * Fazer um programa para ler nome, idade e altura de N pessoas, 
		 * conforme exemplo. Depois, mostrar na tela a altura média das 
		 * pessoas, e mostrar também a porcentagem de pessoas com menos 
		 * de 16 anos, bem como os nomes dessas pessoas caso houver.
		 * 
		 * Exemplo:
		 * Quantas pessoas serao digitadas? 5
		 * Dados da 1a pessoa:
		 * Nome: Joao
		 * Idade: 15
		 * Altura: 1.82
		 * Dados da 2a pessoa:
		 * Nome: Maria
		 * Idade: 16
		 * Altura: 1.60
		 * Dados da 3a pessoa:
		 * Nome: Teresa
		 * Idade: 14
		 * Altura: 1.58
		 * Dados da 4a pessoa:
		 * Nome: Carlos
		 * Idade: 21
		 * Altura: 1.65
		 * Dados da 5a pessoa:
		 * Nome: Paulo
		 * Idade: 17
		 * Altura: 1.78
		 * 
		 * Altura média: 1.69
		 * Pessoas com menos de 16 anos: 40.0%
		 * Joao
		 * Teresa */
		
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
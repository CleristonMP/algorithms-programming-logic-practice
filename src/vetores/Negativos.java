package vetores;
import java.util.Scanner;
import java.util.Locale;

public class Negativos {
	
	public static void main(String[] args) {
		/* Exercício com Vetores
		 * 
		 * Faça um programa que leia um número inteiro positivo N 
		 * (máximo = 10) e depois N números inteiros e armazene-os em um 
		 * vetor. Em seguida, mostrar na tela todos os números negativos 
		 * lidos. 
		 * 
		 * Exemplo:
		 * Quantos numeros voce vai digitar? 6
		 * Digite um numero: 8
		 * Digite um numero: -2
		 * Digite um numero: 9
		 * Digite um numero: 10
		 * Digite um numero: -3
		 * Digite um numero: -7
		 * NUMEROS NEGATIVOS:
		 * -2
		 * -3
		 * -7 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] vet = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero:");
			vet[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS:");
		for (int i = 0; i < n; i++) {
			if(vet[i] < 0) {
				System.out.println(vet[i]);
			}
		}
		
		sc.close();
	}
}
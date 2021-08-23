package estruturas_repetitivas;
import java.util.Scanner;
import java.util.Locale;

public class ValidacaoDeNota {
	
	public static void main(String[] args) {
		/* Exercício de Estruturas Repetitivas
		 * 
		 * Faça um programa que leia as notas referentes às duas avaliações de um aluno. 
		 * Calcule e imprima a média semestral. Faça com que o algoritmo só aceite 
		 * notas válidas (uma nota válida deve pertencer ao intervalo [0,10]). 
		 * Cada nota deve ser validada separadamente.
		 * 
		 * Exemplo 1:
		 * Digite a primeira nota: 3.5
		 * Digite a segunda nota: 10.0
		 * MEDIA = 6.75
		 * 
		 * Exemplo 2:
		 * Digite a primeira nota: -3.5
		 * Valor invalido! Tente novamente: 3.5
		 * Digite a segunda nota: 11.0
		 * Valor invalido! Tente novamente: 10.5
		 * Valor invalido! Tente novamente: 10.0
		 * MEDIA = 6.75 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.print("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		
		while (nota1 < 0 || nota1 > 10.0) {
			System.out.print("Valor invalido! Tente novamente: ");
			nota1 = sc.nextDouble();
		}
		
		System.out.print("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		
		while (nota2 < 0 || nota2 > 10.0) {
			System.out.print("Valor invalido! Tente novamente: ");
			nota2 = sc.nextDouble();
		}
		
		media = (nota1 + nota2) / 2.0;
		
		System.out.println("MEDIA = " + String.format("%.2f", media));
		
		sc.close();
	}
}
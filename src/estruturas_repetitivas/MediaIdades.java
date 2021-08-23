package estruturas_repetitivas;
import java.util.Scanner;
import java.util.Locale;

public class MediaIdades {
	
	public static void main(String[] args) {
		/* Exercício de Estruturas Repetitivas
		 * 
		 * Faça um programa para ler um número indeterminado de dados, contendo cada um, 
		 * a idade de um indivíduo. O último dado, que não entrará nos cálculos, 
		 * contém um valor de idade negativa. Calcular e imprimir a idade média 
		 * deste grupo de indivíduos. Se for entrado um valor negativo na primeira vez,
		 * mostrar a mensagem "IMPOSSIVEL CALCULAR".
		 * 
		 * Exemplo 1:
		 * Digite as idades:
		 * 31
		 * 27
		 * 46
		 * -5
		 * MEDIA = 34.67
		 * 
		 * Exemplo 2:
		 * Digite as idades:
		 * -10
		 * IMPOSSIVEL CALCULAR */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade, cont;
		double soma, media;
		
		System.out.println("Digite as idades:");
		idade = sc.nextInt();
		
		soma = 0;
		cont = 0;

		while (idade > 0) {
			soma = soma + idade;
			cont++;
			idade = sc.nextInt();
		}
	
		if (cont == 0) {
			System.out.println("IMPOSSIVEL CALCULAR");
		} else {
			media = soma / cont;
			System.out.println("MEDIA = " + String.format("%.2f", media));
		}
		
		sc.close();
	}
}
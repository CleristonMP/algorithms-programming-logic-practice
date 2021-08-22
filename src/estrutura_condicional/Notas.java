package estrutura_condicional;
import java.util.Scanner;
import java.util.Locale;

public class Notas {
	
	public static void main(String[] args) {
		/* Exercício de Estrutura Condicional
		 * 
		 * Fazer um programa para ler as duas notas que um aluno obteve no primeiro 
		 * e segundo semestres de uma disciplina anual. Em seguida, mostrar a nota final 
		 * que o aluno obteve (com uma casa decimal) no ano juntamente com um texto 
		 * explicativo. Caso a nota final do aluno seja inferior a 60.00, mostrar a 
		 * mensagem "REPROVADO", conforme exemplos.
		 * 
		 * Exemplo 1:
		 * Digite a primeira nota: 45.5
		 * Digite a segunda nota: 31.3
		 * NOTA FINAL = 76.8
		 * 
		 * Exemplo 2:
		 * Digite a primeira nota: 34.0
		 * Digite a segunda nota: 23.5
		 * NOTA FINAL = 57.5
		 * REPROVADO */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();
		System.out.print("Digite a segunda nota:");
		double nota2 = sc.nextDouble();
		
		double soma = nota1 + nota2;
		
		System.out.println("NOTA FINAL = " + String.format("%.1f", soma));
		
		if (soma < 60.00) {
			System.out.println("REPROVADO");
		}
		
		sc.close();
	}
}
package estrutura_sequencial;
import java.util.Scanner;
import java.util.Locale;

public class Idades {
	
	public static void main(String[] args) {
		/* Exercício de Estrutura Sequencial
		 * 
		 *  Fazer um programa para ler o nome e idade de duas pessoas. 
		 *  Ao final mostrar uma mensagem com os nomes e a idade média entre 
		 *  essas pessoas, com uma casa decimal, conforme exemplo.
		 *  
		 *  Exemplo:
		 *  Dados da primeira pessoa:
		 *  Nome: Maria Silva
		 *  Idade: 19
		 *  Dados da segunda pessoa:
		 *  Nome: Joao Melo
		 *  Idade 20
		 *  A idade média de Maria Silva e Joao Melo é de 19.5 anos */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dados da primeira pessoa:");
		System.out.print("Nome: ");
		String nome1 = sc.nextLine();
		System.out.print("Idade: ");
		int idade1 = sc.nextInt();
		
		System.out.println("Dados da segunda pessoa:");
		System.out.print("Nome: ");
		sc.nextLine();
		String nome2 = sc.nextLine();
		System.out.print("Idade: ");
		int idade2 = sc.nextInt();
		
		double media = (idade1 + idade2) / 2.0;
		
		System.out.println("A idade média de " + nome1 + " e " + nome2 + " é de " + String.format("%.1f", media) + " anos");
		
		sc.close();
	}
}

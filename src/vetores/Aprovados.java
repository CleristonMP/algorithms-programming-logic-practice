package vetores;
import java.util.Scanner;
import java.util.Locale;

public class Aprovados {
	
	public static void main(String[] args) {
		/* Exercício com Vetores
		 * 
		 * Fazer um programa para ler um conjunto de N nomes de alunos, 
		 * bem como as notas que eles tiraram no 1º e 2º semestres. 
		 * Cada uma dessas informações deve ser armazenada em um vetor. 
		 * Depois, imprimir os nomes dos alunos aprovados, 
		 * considerando aprovados aqueles cuja média das notas seja maior 
		 * ou igual a 6.0 (seis).
		 * 
		 * Exemplo:
		 * Quantos alunos serao digitados? 4
		 * Digite nome, primeira e segunda nota do 1o aluno:
		 * Joao Silva
		 * 7.0
		 * 8.5
		 * Digite nome, primeira e segunda nota do 2o aluno:
		 * Maria Teixeira
		 * 9.2
		 * 6.5
		 * Digite nome, primeira e segunda nota do 3o aluno:
		 * Carlos Carvalho
		 * 5.0
		 * 6.0
		 * Digite nome, primeira e segunda nota do 4o aluno:
		 * Teresa Pires
		 * 5.5
		 * 6.5
		 * Alunos aprovados:
		 * Joao Silva
		 * Maria Teixeira
		 * Teresa Pires */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		double[] nota1 = new double[n], nota2 = new double[n], media = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno:");
			sc.nextLine();
			nome[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < n; i++) {
			media[i] = (nota1[i] + nota2[i]) / 2.0;
		}
		
		System.out.println("Alunos aprovados:");
		for (int i = 0; i < n; i++) {
			if(media[i] >= 6.0) {
				System.out.println(nome[i]);
			}
		}
		
		sc.close();
	}
}
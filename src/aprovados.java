import java.util.Scanner;
import java.util.Locale;

public class aprovados {
	
	public static void main(String[] args) {
		
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
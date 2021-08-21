import java.util.Scanner;
import java.util.Locale;

public class mais_velho {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		}
		
		int velha = idade[0], pos = 0;
		
		for (int i = 0; i < n; i++) {
			if (idade[i] > velha) {
				velha = idade[i];
				pos = i;
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + nome[pos]);
		
		sc.close();
	}
}
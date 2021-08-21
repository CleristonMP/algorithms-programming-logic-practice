import java.util.Scanner;
import java.util.Locale;

public class tempo_de_jogo {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int inicio, fim, duracao;
		
		System.out.print("Hora inicial: ");
		inicio = sc.nextInt();
		System.out.print("Hora final: ");
		fim = sc.nextInt();
		
		if (inicio == fim) {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		} else if (inicio > fim) {
			duracao = 24 - inicio + fim;
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		} else {
			duracao = fim - inicio;
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		}
		
		sc.close();
	}
}
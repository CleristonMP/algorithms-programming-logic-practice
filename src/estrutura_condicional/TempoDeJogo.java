package estrutura_condicional;
import java.util.Scanner;
import java.util.Locale;

public class TempoDeJogo {
	
	public static void main(String[] args) {
		/* Exercício de Estrutura Condicional
		 * 
		 * Leia a hora inicial e a hora final de um jogo. 
		 * A seguir calcule a duração do jogo, sabendo que o mesmo
		 * pode começar em um dia e terminar em outro, 
		 * tendo uma duração mínima de 1 hora e máxima de 24 horas.
		 * 
		 * Exemplo 1:
		 * Hora inicial: 16
		 * Hora final: 2
		 * O JOGO DUROU 10 HORA(S)
		 * 
		 * Exemplo 2:
		 * Hora inicial: 0
		 * Hora final: 0
		 * O JOGO DUROU 24 HORA(S)
		 * 
		 * Exemplo 3:
		 * Hora inicial: 2
		 * Hora final: 16
		 * O JOGO DUROU 14 HORA(S) */
		
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
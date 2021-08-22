package estrutura_sequencial;
import java.util.Scanner;
import java.util.Locale;

public class Duracao {
	
	public static void main(String[] args) {
		/* Exercício de Estrutura Sequencial
		 * 
		 * Fazer um programa para ler uma duração de tempo em segundos, 
		 * daí imprimir na tela esta duração no formato horas:minutos:segundos.
		 * 
		 * Exemplo 1:
		 * Digite a duracao em segundos: 300
		 * 0:5:0
		 * 
		 * Exemplo 2:
		 * Digite a duracao em segundos: 12506
		 * 3:28:26
		 * 
		 * Exemplo 3:
		 * Digite a duracao em segundos: 140811
		 * 39:6:51 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a duracao em segundos: ");
		int duracao = sc.nextInt();
		
		int hora, minuto, segundo;
		
		hora = duracao / 3600;
		minuto = (duracao % 3600) / 60;
		segundo = (duracao % 3600) % 60;
		
		System.out.println(hora + ":" + minuto + ":" + segundo);
		
		sc.close();
	}
}
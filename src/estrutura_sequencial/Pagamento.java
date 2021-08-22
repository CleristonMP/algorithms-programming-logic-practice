package estrutura_sequencial;
import java.util.Scanner;
import java.util.Locale;

public class Pagamento {
	
	public static void main(String[] args) {
		/* Exerc�cio de Estrutura Sequencial
		 * 
		 * Fazer um programa para ler o nome de um(a) funcion�rio(a), 
		 * o valor que ele(a) recebe por hora, e a quantidade de horas trabalhadas 
		 * por ele(a). Ao final, mostrar o valor do pagamento do funcion�rio com
		 * uma mensagem explicativa, conforme exemplo.
		 * 
		 * Exemplo 1:
		 * Nome: Joao Silva
		 * Valor por hora: 50.00
		 * Horas trabalhadas: 60
		 * O pagamento para Joao Silva deve ser 3000.00
		 * 
		 * Exemplo 2:
		 * Nome: Maria Dias
		 * Valor por hora: 60.00
		 * Horas trabalhadas: 100
		 * O pagamento para Maria Dias deve ser 6000.00 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Valor por hora: ");
		double valor = sc.nextDouble();
		System.out.print("Horas trabalhadas: ");
		int horas = sc.nextInt();
		
		double pagamento = valor * horas;
		
		System.out.println("O pagamento para " + nome + " deve ser " + String.format("%.2f", pagamento));
		
		sc.close();
	}
}
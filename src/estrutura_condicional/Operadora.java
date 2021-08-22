package estrutura_condicional;
import java.util.Scanner;
import java.util.Locale;

public class Operadora {
	
	public static void main(String[] args) {
		/* Exercício de Estrutura Condicional
		 * 
		 * Uma operadora de telefonia cobra R$ 50.00 por um plano básico 
		 * que dá direito a 100 minutos de telefone. 
		 * Cada minuto que exceder a franquia de 100 minutos custa R$ 2.00. 
		 * Fazer um programa para ler a quantidade de minutos que uma pessoa consumiu, 
		 * daí mostrar o valor a ser pago.
		 * 
		 * Exemplo 1:
		 * Digite a quantidade de minutos: 22
		 * Valor a pagar: R$ 50.00
		 * 
		 * Exemplo 2:
		 * Digite a quantidade de minutos: 103
		 * Valor a pagar: R$ 56.00 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos;
		double excede;
		
		System.out.print("Digite a quantidade de minutos: ");
		minutos = sc.nextInt();
		
		if (minutos < 100) {
			System.out.println("Valor a pagar: R$ 50.00");
		} else {
			excede = (minutos - 100) * 2.00 + 50.00;
			System.out.println("Valor a pagar: R$ " + String.format("%.2f", excede));
		}
		
		sc.close();
	}
}
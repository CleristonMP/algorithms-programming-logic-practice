package estruturas_repetitivas;
import java.util.Scanner;
import java.util.Locale;

public class Combustivel {
	
	public static void main(String[] args) {
		/* Exercício de Estruturas Repetitivas
		 * 
		 * Um posto de combustíveis deseja determinar qual de seus produtos tem 
		 * a preferência de seus clientes. Escreva um algoritmo para ler o tipo de 
		 * combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 
		 * 3.Diesel 4.Fim). Caso o usuário informe um código inválido 
		 * (fora da faixa de 1 a 4) deve ser solicitado um novo código 
		 * (até que seja válido). O programa será encerrado quando o código informado 
		 * for o número 4, devendo então mostrar a mensagem "MUITO OBRIGADO", 
		 * bem como as quantidades de cada combustível.
		 * 
		 * Exemplo:
		 * Informe um codigo (1, 2, 3) ou 4 para parar: 8
		 * Informe um codigo (1, 2, 3) ou 4 para parar: 1
		 * Informe um codigo (1, 2, 3) ou 4 para parar: 7
		 * Informe um codigo (1, 2, 3) ou 4 para parar: 2
		 * Informe um codigo (1, 2, 3) ou 4 para parar: 2
		 * Informe um codigo (1, 2, 3) ou 4 para parar: 4
		 * MUITO OBRIGADO
		 * Alcool: 1
		 * Gasolina: 2
		 * Diesel: 0 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo, alcool, gaso, diesel;
		
		alcool = 0;
		gaso = 0;
		diesel = 0;
		
		do {
			System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
			codigo = sc.nextInt();
			
			if (codigo == 1) {
				alcool++;
			} else if (codigo == 2) {
				gaso++;
			} else if (codigo == 3) {
				diesel++;
			}
			
		} while (codigo != 4);
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gaso);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}
}
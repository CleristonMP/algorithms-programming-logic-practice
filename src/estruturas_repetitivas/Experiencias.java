package estruturas_repetitivas;
import java.util.Scanner;
import java.util.Locale;

public class Experiencias {
	
	public static void main(String[] args) {
		/* Exercício de Estruturas Repetitivas
		 * 
		 * Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa
		 *  de sua ajuda para organizar os experimentos de um laboratório, o qual ela 
		 *  é responsável. Ela quer saber no final do ano, quantas cobaias foram utilizadas 
		 *  no laboratório e o percentual de cada tipo de cobaia utilizada. 
		 *  Este laboratório em especial utiliza três tipos de cobaias: 
		 *  sapos, ratos e coelhos. Para obter estas informações, ela sabe exatamente 
		 *  o número de experimentos que foram realizados, o tipo de cobaia utilizada 
		 *  e a quantidade de cobaias utilizadas em cada experimento. 
		 *  Faça um programa que leia um valor inteiro N que indica os vários casos de teste
		 *  que vem a seguir. Cada caso de teste contém um inteiro que representa a 
		 *  quantidade de cobaias utilizadas e uma letra ('C', 'R' ou 'S'), indicando o tipo
		 *  de cobaia (R:Rato S:Sapo C:Coelho). 
		 *  Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia 
		 *  utilizada e o percentual de cada uma em relação ao total de cobaias utilizadas, 
		 *  sendo que o percentual deve ser apresentado com dois dígitos após o ponto.
		 *  
		 *  Exemplo:
		 *  Quantos casos de teste serao digitados? 10
		 *  Quantidade de cobaias: 10
		 *  Tipo de cobaia: C
		 *  Quantidade de cobaias: 6
		 *  Tipo de cobaia: R
		 *  Quantidade de cobaias: 15
		 *  Tipo de cobaia: S
		 *  Quantidade de cobaias: 5
		 *  Tipo de cobaia: C
		 *  Quantidade de cobaias: 14
		 *  Tipo de cobaia: R
		 *  Quantidade de cobaias: 9
		 *  Tipo de cobaia: C
		 *  Quantidade de cobaias: 6
		 *  Tipo de cobaia: R
		 *  Quantidade de cobaias: 8
		 *  Tipo de cobaia: S
		 *  Quantidade de cobaias: 5
		 *  Tipo de cobaia: C
		 *  Quantidade de cobaias: 14
		 *  Tipo de cobaia: R
		 *  
		 *  RELATORIO FINAL:
		 *  Total: 92 cobaias
		 *  Total de coelhos: 29
		 *  Total de ratos: 40
		 *  Total de sapos: 23
		 *  Percentual de coelhos: 31.52
		 *  Percentual de ratos: 43.48
		 *  Percentual de sapos: 25.00 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtd, total, contRatos, contSapos, contCoelhos;
		double perRatos, perSapos, perCoelhos;
		char tipo;
		
		System.out.print("Quantos casos de teste serao digitados? ");
		int n = sc.nextInt();
		
		total = 0;
		contRatos = 0;
		contSapos = 0;
		contCoelhos = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.print("Quantidade de cobaias: ");
			qtd = sc.nextInt();
			System.out.print("Tipo de cobaia: ");
			tipo = sc.next().charAt(0);
			
			total  = total + qtd;
			
			switch (tipo) {
			
			case 'R':
				contRatos = contRatos + qtd;
				break;
			
			case 'S':
				contSapos = contSapos + qtd;
				break;
			
			case 'C':
				contCoelhos = contCoelhos + qtd;
				break;
				
			}
		}
		
		perCoelhos = 100.00 * contCoelhos / total;
		perRatos = 100.00 * contRatos / total;
		perSapos = 100.00 * contSapos / total;
		
		System.out.println();
		System.out.println("RELATORIO FINAL:");
		System.out.println("Total: " + total + " cobaias");
		System.out.println("Total de coelhos: " + contCoelhos);
		System.out.println("Total de ratos: " + contRatos);
		System.out.println("Total de sapos: " + contSapos);
		System.out.println("Percentual de coelhos: " + String.format("%.2f", perCoelhos));
		System.out.println("Percentual de ratos: " + String.format("%.2f", perRatos));
		System.out.println("Percentual de sapos: " + String.format("%.2f", perSapos));
		
		sc.close();
	}
}
import java.util.Scanner;
import java.util.Locale;

public class experiencias {
	
	public static void main(String[] args) {
		
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
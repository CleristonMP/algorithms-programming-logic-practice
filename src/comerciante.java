import java.util.Scanner;
import java.util.Locale;

public class comerciante {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Serao digitados dados de quantos produtos? ");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		double[] compra = new double[n], venda = new double[n], lucro = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Produto " + (i+1) + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			System.out.print("Preco de compra: ");
			compra[i] = sc.nextDouble();
			System.out.print("Preco de venda: ");
			venda[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < n; i++) {
			lucro[i] = 100.00 * (venda[i] - compra[i]) / compra[i];
		}
		
		int abaixo = 0, entre = 0, acima = 0;
		
		for (int i = 0; i < n; i++) {
			if (lucro[i] < 10.0) {
				abaixo++;
			} else if (lucro[i] <= 20.0) {
				entre++;
			} else {
				acima++;
			}
		}
		
		double totalCompra = 0, totalVenda = 0, lucroTotal;
		
		for (int i = 0; i < n; i++) {
			totalCompra += compra[i];
		}
		
		for (int i = 0; i < n; i++) {
			totalVenda += venda[i];
		}
		
		lucroTotal = totalVenda - totalCompra;
		
		System.out.println();
		System.out.println("RELATORIO:");
		System.out.println("Lucro abaixo de 10%: " + abaixo);
		System.out.println("Lucro entre 10% e 20%: " + entre);
		System.out.println("Lucro acima de 20%: " + acima);
		System.out.println("Valor total de compra: " + String.format("%.2f", totalCompra));
		System.out.println("Valor total de venda: " + String.format("%.2f", totalVenda));
		System.out.println("Lucro total: " + String.format("%.2f", lucroTotal));
		
		sc.close();
	}
}
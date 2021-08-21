import java.util.Scanner;
import java.util.Locale;

public class troco {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Preço unitário do produto: ");
		double preco = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		int qtd = sc.nextInt();
		System.out.print("Dinheiro recebido: ");
		double dinheiro = sc.nextDouble();
		
		double troco = dinheiro - qtd * preco;
		
		System.out.println("TROCO = " + String.format("%.2f", troco));
		
		sc.close();
	}
}
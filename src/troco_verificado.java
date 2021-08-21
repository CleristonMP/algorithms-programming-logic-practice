import java.util.Scanner;
import java.util.Locale;

public class troco_verificado {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtd;
		double preco, dinheiro, troco;
		
		System.out.print("Preço unitário do produto: ");
		preco = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		qtd = sc.nextInt();
		System.out.print("Dinheiro recebido: ");
		dinheiro = sc.nextDouble();
		
		troco = dinheiro - qtd * preco;
		
		if (troco > 0) {
			System.out.println("TROCO = " + String.format("%.2f", troco));
		} else {
			System.out.println("DINHEIRO INSUFICIENTE. FALTAM " + String.format("%.2f", -troco) + " REAIS");
		}
		
		sc.close();
	}
}
import java.util.Scanner;
import java.util.Locale;

public class lanchonete {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo, qtd;
		double valor;
		
		System.out.print("Codigo do produto comprado: ");
		codigo = sc.nextInt();
		System.out.print("Quantidade comprada: ");
		qtd = sc.nextInt();
		
		valor = 0;
		
		switch(codigo) {
		case 1:
			valor = 5.00 * qtd;
			break;
		case 2:
			valor = 3.50  * qtd;
			break;
		case 3:
			valor = 4.80 * qtd;
			break;
		case 4:
			valor = 8.90 * qtd;
			break;
		case 5:
			valor = 7.32 * qtd;
			break;
		}
		
		System.out.println("Valor a pagar: R$ " + String.format("%.2f", valor));
		
		sc.close();
	}
}
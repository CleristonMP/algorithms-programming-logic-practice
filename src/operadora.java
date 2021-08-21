import java.util.Scanner;
import java.util.Locale;

public class operadora {
	
	public static void main(String[] args) {
		
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
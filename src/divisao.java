import java.util.Scanner;
import java.util.Locale;

public class divisao {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		double divisao;
		
		System.out.print("Quantos casos voce vai digitar? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Entre com o numerador: ");
			x = sc.nextInt();
			System.out.print("Entre com o denominador: ");
			y = sc.nextInt();
			
			if (y == 0) {
				System.out.println("DIVISAO IMPOSSIVEL");
			} else {
			
			divisao = (double) x / y;
			
			System.out.println("DIVISAO = " + String.format("%.2f", divisao));
			
			}			
		}
		
		sc.close();
	}
}
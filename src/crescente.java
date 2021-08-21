import java.util.Scanner;
import java.util.Locale;

public class crescente {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Digite dois numeros:");
		x = sc.nextInt();
		y = sc.nextInt();
		
		while (x != y) {
			if (x < y) {
				System.out.println("CRESCENTE!");
			} else {
				System.out.println("DECRESCENTE!");
			}
			
			System.out.println("Digite outrosdois numeros:");
			x = sc.nextInt();
			y = sc.nextInt();
		}
		sc.close();
	}
}
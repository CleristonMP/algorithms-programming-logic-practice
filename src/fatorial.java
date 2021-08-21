import java.util.Scanner;
import java.util.Locale;

public class fatorial {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int fat;
		
		System.out.print("Digite o valor de N: ");
		int n = sc.nextInt();
		
		fat = 1;
		if (n != 0) {
			for (int i = 0; i < n; i++) {
				fat = fat * (n - i);
			}
		}
		
		if (n == 0) {
			System.out.println("FATORIAL = 1");
		} else {
			System.out.println("FATORIAL = " + fat);
		}
		
		sc.close();
	}
}
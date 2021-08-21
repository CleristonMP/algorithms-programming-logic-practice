import java.util.Scanner;
import java.util.Locale;

public class tabuada {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Deseja a tabuada para qual valor? ");
		n = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			int mult = n * i;
			System.out.println(n + " x " + i + " = " + mult);
		}
		
		sc.close();
	}
}
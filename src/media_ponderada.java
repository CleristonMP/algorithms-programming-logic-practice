import java.util.Scanner;
import java.util.Locale;

public class media_ponderada {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y, z, mediaPond;
		
		System.out.print("Quantos casos voce vai digitar? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite tres numeros:");
			x = sc.nextDouble();
			y = sc.nextDouble();
			z = sc.nextDouble();
			
			mediaPond = (x * 2 + y * 3 + z * 5) / 10.0;
			
			System.out.println("MEDIA = " + String.format("%.1f", mediaPond));
			
		}
		
		sc.close();
	}
}
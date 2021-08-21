import java.util.Scanner;
import java.util.Locale;

public class circulo {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do raio do circulo: ");
		double raio = sc.nextDouble();
		
		double area = 3.14159 * Math.pow(raio, 2);
		
		System.out.println("AREA = " + String.format("%.3f", area));
		
		sc.close();
	}
}
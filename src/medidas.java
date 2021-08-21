import java.util.Scanner;
import java.util.Locale;

public class medidas {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a medida A: ");
		double a = sc.nextDouble();
		System.out.print("Digite a medida B: ");
		double b = sc.nextDouble();
		System.out.print("Digite a medida C: ");
		double c = sc.nextDouble();
		
		double areaQuad, areaTri, areaPezio;
		
		areaQuad = Math.pow(a, 2);
		areaTri = (a * b) / 2.0;
		areaPezio = (a + b) * c / 2.0;
		
		System.out.println("AREA DO QUADRADO = " + String.format("%.4f", areaQuad));
		System.out.println("AREA DO TRIANGULO = " + String.format("%.4f", areaTri));
		System.out.println("AREA DO TRAPEZIO = " + String.format("%.4f", areaPezio));
		
		sc.close();
	}
}
import java.util.Scanner;
import java.util.Locale;

public class consumo {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Distancia percorrida: ");
		int distancia = sc.nextInt();
		System.out.print("Combustível gasto: ");
		double combustivel = sc.nextDouble();
		
		double consumo = distancia / combustivel;
		
		System.out.println("Consumo medio = " + String.format("%.3f", consumo));
		
		sc.close();
	}
}
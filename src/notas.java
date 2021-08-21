import java.util.Scanner;
import java.util.Locale;

public class notas {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();
		System.out.print("Digite a segunda nota:");
		double nota2 = sc.nextDouble();
		
		double soma = nota1 + nota2;
		
		System.out.println("NOTA FINAL = " + String.format("%.1f", soma));
		
		if (soma < 60.00) {
			System.out.println("REPROVADO");
		}
		
		sc.close();
	}
}
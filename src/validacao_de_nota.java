import java.util.Scanner;
import java.util.Locale;

public class validacao_de_nota {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.print("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		
		while (nota1 < 0 || nota1 > 10.0) {
			System.out.print("Valor invalido! Tente novamente: ");
			nota1 = sc.nextDouble();
		}
		
		System.out.print("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		
		while (nota2 < 0 || nota2 > 10.0) {
			System.out.print("Valor invalido! Tente novamente: ");
			nota2 = sc.nextDouble();
		}
		
		media = (nota1 + nota2) / 2.0;
		
		System.out.println("MEDIA = " + String.format("%.2f", media));
		
		sc.close();
	}
}
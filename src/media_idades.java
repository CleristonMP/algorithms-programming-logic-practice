import java.util.Scanner;
import java.util.Locale;

public class media_idades {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade, cont;
		double soma, media;
		
		System.out.println("Digite as idades:");
		idade = sc.nextInt();
		
		soma = 0;
		cont = 0;

		while (idade > 0) {
			soma = soma + idade;
			cont++;
			idade = sc.nextInt();
		}
	
		if (cont == 0) {
			System.out.println("IMPOSSIVEL CALCULAR");
		} else {
			media = soma / cont;
			System.out.println("MEDIA = " + String.format("%.2f", media));
		}
		
		sc.close();
	}
}
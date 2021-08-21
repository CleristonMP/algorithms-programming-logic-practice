import java.util.Scanner;
import java.util.Locale;

public class dentro_fora {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, dentro, fora;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		dentro = 0;
		fora = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			x = sc.nextInt();
			
			if(x >= 10 && x <= 20) {
				dentro++;
			} else {
				fora++;
			}
		}
		
		System.out.println(dentro + " DENTRO");
		System.out.println(fora + " FORA");
		
		sc.close();
	}
}
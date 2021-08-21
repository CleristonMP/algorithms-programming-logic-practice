import java.util.Scanner;
import java.util.Locale;

public class menor_de_tres {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y, z, menor;
		
		System.out.print("Primeiro valor: ");
		x = sc.nextInt();
		System.out.print("Segundo valor: ");
		y = sc.nextInt();
		System.out.print("Terceiro valor: ");
		z = sc.nextInt();
		
		if (x < y && x < z) {
			menor = x;
		} else if (y < z) {
			menor = y;
		} else {
			menor = z;
		}
		
		System.out.println("MENOR = " + menor);
		
		sc.close();
	}
}
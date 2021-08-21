import java.util.Scanner;
import java.util.Locale;

public class combustivel {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo, alcool, gaso, diesel;
		
		alcool = 0;
		gaso = 0;
		diesel = 0;
		
		do {
			System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
			codigo = sc.nextInt();
			
			if (codigo == 1) {
				alcool++;
			} else if (codigo == 2) {
				gaso++;
			} else if (codigo == 3) {
				diesel++;
			}
			
		} while (codigo != 4);
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gaso);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}
}
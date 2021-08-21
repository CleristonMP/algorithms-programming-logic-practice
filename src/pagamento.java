import java.util.Scanner;
import java.util.Locale;

public class pagamento {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Valor por hora: ");
		double valor = sc.nextDouble();
		System.out.print("Horas trabalhadas: ");
		int horas = sc.nextInt();
		
		double pagamento = valor * horas;
		
		System.out.println("O pagamento para " + nome + " deve ser " + String.format("%.2f", pagamento));
		
		sc.close();
	}
}
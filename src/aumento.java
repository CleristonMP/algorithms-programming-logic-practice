import java.util.Scanner;
import java.util.Locale;

public class aumento {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, novo, aumento;
		int porcentagem;
		
		System.out.print("Digite o salario da pessoa: ");
		salario = sc.nextDouble();
		
		if (salario <= 1000.00) {
			aumento = salario * 0.20;
			novo = salario + aumento;
			porcentagem = 20;
		} else if (salario <= 3000.00) {
			aumento = salario * 0.15;
			novo = salario + aumento;
			porcentagem = 15;
		} else if (salario <= 8000.00) {
			aumento = salario * 0.10;
			novo = salario + aumento;
			porcentagem = 10;
		} else {
			aumento = salario * 0.05;
			novo = salario + aumento;
			porcentagem = 5;
		}
		
		System.out.println("Novo salario = R$ " + String.format("%.2f", novo));
		System.out.println("Aumento = R$ " + String.format("%.2f", aumento));
		System.out.println("Porcentagem = " + porcentagem + " %");
		
		sc.close();
	}
}
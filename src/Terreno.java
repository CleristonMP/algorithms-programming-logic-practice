import java.util.Locale;
import java.util.Scanner;

public class Terreno {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a largura do terreno: ");
		double largura = sc.nextDouble();
		System.out.print("Digite o comprimento do terreno: ");
		double comprimento = sc.nextDouble();
		System.out.print("Digite o valor do metro quadrado: ");
		double valor = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * valor;
		
		System.out.println("Area do terreno = " + String.format("%.2f", area));
		System.out.println("Preco do terreno = " + String.format("%.2f", preco));
		
		sc.close();
	}

}
import java.util.Scanner;
import java.util.Locale;

public class duracao {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a duracao em segundos: ");
		int duracao = sc.nextInt();
		
		int hora, minuto, segundo;
		
		hora = duracao / 3600;
		minuto = (duracao % 3600) / 60;
		segundo = (duracao % 3600) % 60;
		
		System.out.println(hora + ":" + minuto + ":" + segundo);
		
		sc.close();
	}
}
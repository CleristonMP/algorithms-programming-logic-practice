package estrutura_condicional;
import java.util.Scanner;
import java.util.Locale;

public class Aumento {
	
	public static void main(String[] args) {
		/* Exercício de Estrutura Condicional
		 * 
		 * Uma empresa vai conceder um aumento percentual de
		 * salário aos seus funcionários dependendo de quanto
		 * cada pessoa ganha, conforme tabela ao lado. Fazer um
		 * programa para ler o salário de uma pessoa, daí mostrar
		 * qual o novo salário desta pessoa depois do aumento,
		 * quanto foi o aumento e qual foi a porcentagem de
		 * aumento.
		 * 
		 * Exemplo 1:
		 * Digite o salario da pessoa: 2500.00
		 * Novo salario = R$ 2875.00
		 * Aumento = R$ 375.00
		 * Porcentagem = 15 %
		 * 
		 * Exemplo 2:
		 * Digite o salario da pessoa: 8000.00
		 * Novo salario = R$ 8800.00
		 * Aumento = R$ 800.00
		 * Porcentagem = 10 % */
		
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
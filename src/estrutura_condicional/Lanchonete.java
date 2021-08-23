package estrutura_condicional;
import java.util.Scanner;
import java.util.Locale;

public class Lanchonete {
	
	public static void main(String[] args) {
		/* Exercício de Estrutura Condicional
		 * 
		 * Uma lanchonete possui vários produtos. Cada produto possui um código
		 * e um preço. Você deve fazer um programa para ler o código e a
		 * quantidade comprada de um produto (suponha um código válido), daí
		 * informar qual o valor a ser pago, com duas casas decimais, conforme
		 * tabela de produtos.
		 * 
		 * Código do | Preço do
		 * produto		produto
		 * 		1 		R$ 5.00
		 * 		2 		R$ 3.50
		 * 		3 		R$ 4.80
		 * 		4 		R$ 8.90
		 * 		5 		R$ 7.32 
		 * 
		 * Exemplo 1:
		 * Codigo do produto comprado: 1
		 * Quantidade comprada: 3
		 * Valor a pagar: R$ 15.00
		 * 
		 * Exemplo 2:
		 * Codigo do produto comprado: 4
		 * Quantidade comprada: 2
		 * Valor a pagar: R$ 17.80 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo, qtd;
		double valor;
		
		System.out.print("Codigo do produto comprado: ");
		codigo = sc.nextInt();
		System.out.print("Quantidade comprada: ");
		qtd = sc.nextInt();
		
		valor = 0;
		
		switch(codigo) {
		case 1:
			valor = 5.00 * qtd;
			break;
		case 2:
			valor = 3.50  * qtd;
			break;
		case 3:
			valor = 4.80 * qtd;
			break;
		case 4:
			valor = 8.90 * qtd;
			break;
		case 5:
			valor = 7.32 * qtd;
			break;
		}
		
		System.out.println("Valor a pagar: R$ " + String.format("%.2f", valor));
		
		sc.close();
	}
}
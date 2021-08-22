package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Glicose {

	public static void main(String[] args) {
		/* Exercício de Estrutura Condicional
		 * 
		 * Fazer um programa para ler a quantidade de glicose
		 * no sangue de uma pessoa e depois mostrar na tela a
		 * classificação desta glicose de acordo com a tabela de
		 * referência.
		 * 
		 * Classificação | Glicose
		 * Normal | Até 100 mg/dl
		 * Elevado | Maior que 100 até 140 mg/dl
		 * Diabetes | Maior de 140 mg/dl 
		 * 
		 * Exemplo 1:
		 * Digite a medida da glicose: 90.0
		 * Classificacao: normal
		 * 
		 * Exemplo 2:
		 * Digite a medida da glicose: 140.0
		 * Classificacao: elevado
		 * 
		 * Exemplo 3:
		 * Digite a medida da glicose: 143.2
		 * Classificacao: diabetes */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a medida da glicose: ");
		double glicose = sc.nextDouble();
		String classificacao;
		
		if (glicose <= 100.0) {
			classificacao = "Normal";
		} else if (glicose <= 140.0) {
			classificacao = "Elevado";
		} else {
			classificacao = "Diabetes";
		}
		System.out.println("Classificacao: " + classificacao);
		
		sc.close();
	}

}

package aula;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.printf("\nDigite o preço do produto: ");
		double preco = sc.nextDouble();

		System.out.printf("\nNovo valor: %.2f", preco - (preco * 0.10));
		
		sc.close();
	}

}

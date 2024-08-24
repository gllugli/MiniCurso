package aula;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.printf("\nDigite um número: ");
		int num1 = sc.nextInt();
		
		System.out.printf("\nDigite um número: ");
		int num2 = sc.nextInt();
		
		if (num1 > 0 & num2 > 0) {
			System.out.printf("\nMultiplicação: %d", num1 * num2);
		} else {
			System.out.printf("\nSoma: %d", num1 + num2);
		}
		
		sc.close();
	}

}

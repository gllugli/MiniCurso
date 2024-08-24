package aula;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.printf("\nDigite um número: ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.printf("\nÉ par");
		} else {
			System.out.printf("\nÉ ímpar");
		}
		
		sc.close();
	}

}

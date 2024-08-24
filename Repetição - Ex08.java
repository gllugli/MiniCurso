package aula;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int i;

		System.out.printf("\nDigite um número positivo: ");
		int num = sc.nextInt();
		
		if (num > 0) {
			for (i = 1; i <= 10; i++) {
				if (num % i == 0) {
					System.out.printf("\nO número digitado é divisível por %d", i);
				}
			}
		} else {
			System.out.printf("\nDigite um número válido");
		}
		
		sc.close();
	}

}

package aula;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.printf("\nDigite um número: ");
		int num = sc.nextInt();
		
		if (num % 3 == 0 & num % 5 == 0) {
			System.out.printf("\nO número é divisível por 3 e 5");
		} else {
			System.out.printf("\nO número não é divisível por 3 e 5");
		}
		
		sc.close();
	}

}

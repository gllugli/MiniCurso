package aula;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.printf("\nDigite um número: ");
		int num1 = sc.nextInt();

		System.out.printf("\nDigite um número: ");
		int num2 = sc.nextInt();
		
		System.out.printf("\nDigite um número: ");
		int num3 = sc.nextInt();
		
		if (num1 > num2 | num1 > num3) {
			
			if (num2 > num3) {
				System.out.printf("\nMenor número: 3º num", num3);
			} else {
				System.out.printf("\nMenor número: 2º num", num2);
			}
			
		} else if (num2 > num1 | num2 > num3) {
			
			if (num1 > num3) {
				System.out.printf("\nMenor número: 3º num", num3);
			} else {
				System.out.printf("\nMenor número: 1º num", num1);
			}
			
		}
		
		sc.close();
	}

}

package aula;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.printf("\nDigite um número: ");
		int num1 = sc.nextInt();

		System.out.printf("\nDigite um número: ");
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.printf("\nMaior número: %d", num1);
		} else {
			System.out.printf("\nMaior número: %d", num2);
		}
		
		sc.close();
	}

}

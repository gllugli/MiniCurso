package aula;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.printf("\nDigite um número: ");
		double num1 = sc.nextDouble();
		
		System.out.printf("\nDigite um número: ");
		double num2 = sc.nextDouble();
		
		System.out.printf("\nDigite um número: ");
		double num3 = sc.nextDouble();
		
		if (num1 < num2 & num1 < num3) {
			if (num2 < num3) {
				System.out.printf("\nOrdem Crescente: %.1f, %.1f, %.1f", num1, num2, num3);
			} else {
				System.out.printf("\nOrdem Crescente: %.1f, %.1f, %.1f", num1, num3, num2);
			}
		} else if (num2 < num1 & num2 < num3) {
			if (num1 < num3) {
				System.out.printf("\nOrdem Crescente: %.1f, %.1f, %.1f", num2, num1, num3);
			} else {
				System.out.printf("\nOrdem Crescente: %.1f, %.1f, %.1f", num2, num3, num1);
			}
		} else {
			if (num2 < num1) {
				System.out.printf("\nOrdem Crescente: %.1f, %.1f, %.1f", num3, num2, num1);
			} else {
				System.out.printf("\nOrdem Crescente: %.1f, %.1f, %.1f", num3, num1, num2);
			}
		}
		
		sc.close();
	}

}

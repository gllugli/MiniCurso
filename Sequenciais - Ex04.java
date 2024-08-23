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
		
		double mediaPonderada = ((num1 * 2) + (num2 * 3) + (num3 * 5)) / 2 + 3 + 5;
		
		System.out.printf("\nMédia Ponderada: %.2f", mediaPonderada);
		
		sc.close();
	}

}

package aula;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.printf("\nDigite o seu peso: ");
		double peso = sc.nextDouble();

		System.out.printf("\nPeso em libras: %.2f", peso * 2.205);
		
		sc.close();
	}

}

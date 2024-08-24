package aula;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.printf("\nDigite sua idade: ");
		int idade = sc.nextInt();
		
		if (idade <= 9) {
			System.out.printf("\nMirim");
		} else if (idade >= 10 & idade <= 13) {
			System.out.printf("\nInfantil");
		} else if (idade >= 14 & idade <= 17) {
			System.out.printf("\nJuvenil");
		} else {
			System.out.printf("\nAdulto");
		}
		
		sc.close();
	}

}

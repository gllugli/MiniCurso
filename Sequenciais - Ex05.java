package aula;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.printf("\nDigite sua idade: ");
		double idade = sc.nextDouble();
		
		double idadeDias = idade * 365;
		
		System.out.printf("\nSua idade em dias é: %.2f", idadeDias);
		
		sc.close();
	}

}

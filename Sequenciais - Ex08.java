package aula;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.printf("\nDigite quantos dias você trabalhou: ");
		int dias = sc.nextInt();
		
		System.out.printf("\nDigite sua diária: ");
		double diaria = sc.nextDouble();
		
		System.out.printf("\nValor que deve receber: %.2f", dias * diaria);
		
		sc.close();
	}

}

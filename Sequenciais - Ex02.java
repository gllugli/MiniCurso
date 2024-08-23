package aula;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.printf("\nDigite um número: ");
		int num = sc.nextInt();
		
		int dobro = num * 2;
		int triplo = num * 3;
		int quadruplo = num * 4;
		
		System.out.printf("\nDobro: %d \nTriplo: %d \nQuadruplo: %d", dobro, triplo, quadruplo);
		
		sc.close();
	}

}

package aula;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.printf("\nDigite um número: ");
		int num = sc.nextInt();
		
		System.out.printf("\nSucessor: %d \nAntecessor: %d", num + 1, num - 1);
		
		sc.close();
	}

}

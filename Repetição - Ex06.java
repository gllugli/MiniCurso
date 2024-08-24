package aula;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int i;
		
		System.out.printf("\nDigite um número: ");
		int num = sc.nextInt();
		
		for (i = 1; i <= 10; i++) {
				System.out.printf("\n%d x %d = %d", num, i,  num * i);
		}
		
		sc.close();
	}

}

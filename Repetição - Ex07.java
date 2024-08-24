package aula;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int i;

		for (i = 1; i <= 100; i++) {
			if (i % 3 == 0 & i % 5 == 0) {
				System.out.printf("\nFizzBuzz");
			} else if (i % 5 == 0) {
				System.out.printf("\nBuzz");
			} else if (i % 3 == 0) {
				System.out.printf("\nFizz");
			} else {
				System.out.printf("\n%d", i);
			}
		}
		
		sc.close();
	}

}

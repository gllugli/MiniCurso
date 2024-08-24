package aula;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int i;
		
		for (i = 1; i <= 10; i++) {
			System.out.printf("\n%d", i);
		}
		
		sc.close();
	}

}

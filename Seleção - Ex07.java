package aula;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.printf("\nDigite seu salário: ");
		double salario = sc.nextDouble();
		
		if (salario >= 1000) {
			System.out.printf("\nSalário com 5 porcento de aumento: %.2f", salario + (salario * 0.05));
		} else { 
			System.out.printf("\nSalário com 10 porcento de aumento: %.2f", salario + (salario * 0.10));
		}
		
		sc.close();
	}

}

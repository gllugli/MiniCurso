package aula;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.printf("\nDigite seu salário: ");
		double salario = sc.nextDouble();
		
		double salarioNovo = salario + (salario * 0.15);
		
		System.out.printf("\nNovo Salário: %.2f", salarioNovo);
		
		sc.close();
	}

}

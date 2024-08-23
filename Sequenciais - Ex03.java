package aula;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.printf("\nDigite seu peso: ");
		double peso = sc.nextDouble();
		
		System.out.printf("\nDigite sua altura (Em centímetros): ");
		double altura = sc.nextDouble();
		
		double alturaMetros = altura/100;
		
		double imc = peso / Math.pow(alturaMetros, 2);
		
		System.out.printf("\nSeu IMC é: %.1f", imc);
		
		sc.close();
	}

}

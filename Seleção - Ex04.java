package aula;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.printf("\nDigite sua altura: ");
		int altura = sc.nextInt();
		
		double alturaMetros = altura / 100;
		
		System.out.printf("\nDigite seu peso: ");
		double peso = sc.nextDouble();

		System.out.printf("\nDigite seu sexo: ");
		int sexo = sc.next().charAt(0);
		
		double imc = peso / Math.pow(alturaMetros, 2);
		
		if (imc > 24.9) {
			System.out.printf("\nPrecisa perder peso");
		} else if (imc <= 24.9 & imc >= 18.5) {
			System.out.printf("\nPeso ideal");
		} else {
			System.out.printf("\nPrecisa subir seu peso");
		}
		
		sc.close();
	}

}

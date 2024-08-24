package aula;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.printf("\nDigite um núemro entre 1 e 7: ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1: 
			System.out.printf("\nDia: Domingo");
			break;
		case 2: 
			System.out.printf("\nDia: Segunda");
			break;
		case 3: 
			System.out.printf("\nDia: Terça");
			break;
		case 4: 
			System.out.printf("\nDia: Quarta");
			break;
		case 5: 
			System.out.printf("\nDia: Quinta");
			break;
		case 6: 
			System.out.printf("\nDia: Sexta");
			break;
		case 7: 
			System.out.printf("\nDia: Sábado");
			break;
		default:
			System.out.printf("\nDigite um número válido");
			break;
		}
		
		sc.close();
	}

}

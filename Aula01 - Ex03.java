package a01;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		int num;
		double hora;
		double valorHora;
		double salario;
		
		System.out.printf("Qual o numero do funcionario? \nResposta:");
		num = sc.nextInt();
		
		System.out.printf("Quantas horas ele trabalhou? \nResposta:");
		hora = sc.nextDouble();
		
		System.out.printf("Qual o seu salario? \nResposta:");
		valorHora = sc.nextDouble();
		
		salario = valorHora * hora;
		
		System.out.printf("Funcionario: %d \nSalario: %.2f", num, salario);
		
		sc.close();
	}

}

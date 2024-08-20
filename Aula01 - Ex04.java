package a01;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double A;
		double B;
		double C;
		
		double areaTriangulo;
		double areaCirculo;
		double areaTrapezio;
		double areaQuadrado;
		double areaRetangulo;
		
		System.out.println("Digite o valor de A: ");
		A = sc.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		B = sc.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		C = sc.nextDouble();
		
		areaTriangulo = (A * C) / 2;
		
		areaCirculo = 3.14159 * Math.pow(C, 2);
		
		areaTrapezio = ((A + B) * C) / 2;
		
		areaQuadrado = Math.pow(B, 2);
		
		areaRetangulo = A * B;
		
		System.out.printf("Triangulo: %.3f \nCirculo: %.3f \nTrapezio: %.3f \nQuadrado: %.3f \nRetangulo: %.3f", areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo);
		
		sc.close();
	}

}

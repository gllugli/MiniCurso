package a01;

import java.util.Locale;

public class Ex02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double baseMaior = 6.0;
		double baseMenor = 8.0;
		double altura = 5.0;
		
		double area = (baseMaior + baseMenor) * altura / 2;
		
		System.out.printf("Resultado: %.2f", area);
	}

}

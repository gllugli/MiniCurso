package a01;

import java.util.Locale;

public class Ex01 {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.0;
		double measure = 53.234567;
		
		System.out.printf("%s, cujo preço é R$%.2f\n", product1, price1);
		System.out.printf("%s, cujo preço é R$%.2f\n", product2, price2);
		System.out.printf("Registro: %d anos, código %d e gênero %c\n", age, code, gender);
		System.out.printf("Medida com oito casas decimais: %.8f\n", measure);
		System.out.printf("Cercado (três casas decimais): %.3f\n", measure);
		Locale.setDefault(Locale.US); //Trocando a linguagem do código
		System.out.printf("Ponto decimal dos EUA: %.3f\n", measure);
	}
	
}

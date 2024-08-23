import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i;
        
        System.out.printf("\nDigite um numero: ");
        int num1 = sc.nextInt();
        
        System.out.printf("\nDigite um numero: ");
        int num2 = sc.nextInt();
        
        System.out.printf("\nDigite um numero: ");
        int num3 = sc.nextInt();
        
        int soma = num1 + num2 + num3;
        
        System.out.printf("\nSoma dos numeros: %d", soma);
        
        sc.close();
    }
}

import java.util.Scanner;

public class Main 
{

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro: ");
        int num1 = scanner.nextInt();
        
        System.out.println("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();
        
        int soma = num1 + num2;
        
        System.out.println("A soma dos números é: " + soma);
        
        scanner.close();
    }
}

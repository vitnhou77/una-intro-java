import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
		System.out.println("Digite o número 1");
		int numero1 = scanner.nextInt();
		
		System.out.print("Digite o número 2");
        int numero2 = scanner.nextInt();
        
        int soma = numero1 + numero2;
        
        System.out.println("A soma dos dois números é:" + soma);
        
        scanner.close();

	}
}

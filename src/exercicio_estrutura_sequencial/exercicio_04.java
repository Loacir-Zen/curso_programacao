package exercicio_estrutura_sequencial;

import java.util.Scanner;

public class exercicio_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
				
		
		System.out.println("Digite o valor de X: ");
		x = sc.nextInt();
		
		System.out.println("Digite o valor de Y: ");
		y = sc.nextInt();
		
		int soma = x + y;
		
		System.out.printf("SOMA = %d%n", soma);
		
		sc.close();

	}

}

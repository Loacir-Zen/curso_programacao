package exercicio_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_01 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double largura = 0.0;
		double comprimento = 0.0;
		double valorMetroQuadrado = 0.0;
		
		
		System.out.println("Digite a largura do terreno: ");
		largura = sc.nextDouble();
		
		System.out.println("Digite o comprimento do terreno: ");
		comprimento = sc.nextDouble();
		
		System.out.println("Digite o valor do metro quadrado: ");
		valorMetroQuadrado = sc.nextDouble();
		
		
		double area = largura * comprimento;
		double precoTerreno = valorMetroQuadrado * area;
		
		System.out.printf("Area do terreno = %.2f%n", area);
		System.out.printf("Preco do terreno = %.2f%n", precoTerreno);
		
		sc.close();

	}

}

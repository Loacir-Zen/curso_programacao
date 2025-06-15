package exercicio_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double base = 0.0;
		double altura = 0.0;
		
		System.out.println("Base do retangulo: ");
		base = sc.nextDouble();
		
		System.out.println("Altura do retangulo: ");
		altura = sc.nextDouble();
		
		
		double area = base * altura;
		double perimetro = ( base * 2 ) + (altura * 2);
		double diagonal = Math.sqrt(base * base + altura * altura);

		
		System.out.printf("AREA = %.4f%n", area);
		System.out.printf("PERIMETRO = %.4f%n", perimetro);
		System.out.printf("DIAGONAL = %.4f%n", diagonal);
		
		sc.close();

	}

}

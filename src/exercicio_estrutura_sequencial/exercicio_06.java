package exercicio_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio = 0.0;
		double PI = 3.14159;
		double area = 0.0;
		
		System.out.println("Digite o valor do raio do circulo: ");
		raio = sc.nextDouble();
		
		area = PI * Math.pow(raio, 2);
		
		System.out.printf("AREA %.3f",area);

		sc.close();
	}

}

package exercicio_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_08 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double distanciaPercorrida = 0.0;
		double combustivelGasto = 0.0;
		
		System.out.println("Distancia percorrida: ");
		distanciaPercorrida = sc.nextDouble();
		
		System.out.println("Combustível gasto: ");
		combustivelGasto = sc.nextDouble();
		
		double consumoMedio = distanciaPercorrida / combustivelGasto;
		
		System.out.printf("Concumo medio %.3f",consumoMedio);
		
		sc.close();
		
		

	}

}

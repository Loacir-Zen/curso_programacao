package estrutura_sequencial;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		String nome = "Maria";
		int idade = 32;
		double renda = 4000.00;
		
		int y = 32;
		double x = 10.35784;
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n",x);
		System.out.printf("%.4f%n",x);
		System.out.println("Bom dia");
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n",x);
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f metros%n", x);
		System.out.printf("%s tem %d anos e ganha %.2f reais%n", nome, idade, renda);

	}

}

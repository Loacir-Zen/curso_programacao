package exercicio_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double precoUnitario = 0.0;
		int qtdeProduto = 0;
		double dinheiroRecebido = 0.0;
		
		System.out.println("Preço unitário do produto: ");
		precoUnitario = sc.nextDouble();
		
		System.out.println("Quantidade comprada: ");
		qtdeProduto = sc.nextInt();
		
		System.out.println("Dinheiro recebido: ");
		dinheiroRecebido = sc.nextDouble();
		
		double troco = dinheiroRecebido - ( precoUnitario * qtdeProduto);
		
		
		System.out.printf("TROCO %.2f", troco);
		
		sc.close();
		
		
		
		

	}

}

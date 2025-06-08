package processamento_dados;

import java.util.Locale;
import java.util.Scanner;

public class entradaDeDados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String nome;
		int idade;
		double altura;
		char sexo;
		
		System.out.println("Digite um nome: ");
		nome = sc.next();
		System.out.println("Você digitou: " + nome);
		
		System.out.println("-----------------------------");
		
		System.out.println("Digite a idade ");
		idade = sc.nextInt();
		System.out.println("Você digitou: " + idade);
		
		System.out.println("-----------------------------");
		
		System.out.println("Digite a altura: ");
		altura = sc.nextDouble();
		System.out.printf("Você digitou %.2f%n:", altura);
		
		System.out.println("-----------------------------");
		
		System.out.println("Digite o sexo: ");
		sexo = sc.next().charAt(0);
		System.out.println("Você digitou: " + sexo);
		
		
		sc.close();

	}

}

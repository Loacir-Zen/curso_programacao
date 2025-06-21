package exercicio_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_07 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome = "";
		double valorHora = 0.0;
		double qtdeHorasTrabalhadas = 0.0;
		
		System.out.println("Nome: ");
		nome = sc.nextLine();
		
		System.out.println("Valor por hora: ");
		valorHora = sc.nextDouble();
		
		System.out.println("Horas trabalhadas: ");
		qtdeHorasTrabalhadas = sc.nextDouble();
		
		double salario = valorHora * qtdeHorasTrabalhadas;
		
		System.out.printf("O pagamento para %s deve ser %.2f", nome, salario);
		
		sc.close();
	}

}

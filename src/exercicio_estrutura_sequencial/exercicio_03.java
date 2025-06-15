package exercicio_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nomePrimeiraPessoa = "";
		String nomeSegundaPessoa = "";
		int idadePrimeiraPessoa = 0;
		int idadeSegundaPessoa = 0;
		
		System.out.println("Dados da primeira pessoa: ");
		System.out.println("Nome: ");
		nomePrimeiraPessoa = sc.nextLine();
		
		System.out.println("Idade: ");
		idadePrimeiraPessoa = sc.nextInt();
		
		
		sc.nextLine();
		System.out.println("Dados da segunda pessoa: ");
		System.out.println("Nome: ");
		nomeSegundaPessoa = sc.nextLine();
		
		System.out.println("Idade: ");
		idadeSegundaPessoa = sc.nextInt();
		
		double mediaIdades = (idadePrimeiraPessoa + idadeSegundaPessoa)/2.0;
		
		System.out.printf("A idade média de %s e %s é de %.1f anos", nomePrimeiraPessoa, nomeSegundaPessoa, mediaIdades);
		
		sc.close();

	}

}

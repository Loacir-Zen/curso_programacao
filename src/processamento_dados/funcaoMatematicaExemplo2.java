package processamento_dados;

public class funcaoMatematicaExemplo2 {

	public static void main(String[] args) {
		
		double delta = 0;
		
		double a, b, c, x1, x2;
		
		a = 5;
		b = 2;
		c = 2;
				
		
		delta = Math.pow(b, 2.0) - 4*a*c;
		
		x1 = (-b + Math.sqrt(delta) / 2.0);
		x2 = (-b - Math.sqrt(delta) / 2.0);
		
		System.out.println(x1);
		System.out.println(x2);
	}

}

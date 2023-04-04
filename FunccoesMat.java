package cursoJava;

public class FunccoesMat {

	public static void main(String[] args) {
		
		// A = MATH.SQRT(X); 
		// RAIZ QUADRADA
		
		// A = MATH.POW (X,Y);
		// VARIAVEL A RECEBE O RESULTADO DE X ELEVADO A Y
		
		// A = MATH.ABS(X);
		// VARIAVEL A RECEBE O VALOR ABSOLUTO DE X
		
		
		double x = 3.0;
		double y = 4.0;
		double z = 5.0;
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25);
		
		System.out.println("Raiz quadrada de " + x + " = "+ A);
		System.out.println("Raiz quadrada de " + y + " = "+ B);
		System.out.println("Raiz quadrada de 25 = "+ C);
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		
		System.out.println(x + " elevado a " + y + " = "+ A);
		System.out.println(x + " elevado ao quadrado = "+ B);
		System.out.println("5 elevado ao quadrado = "+ C);
		
		A = Math.abs(y);
		System.out.println("Valor absoluto de "+ y + " = "+ A);
		
		
		
		
		
	}

}

package cursoJava;
import java.util.Locale;
import java.util.Scanner;

public class EntradadeDados {

	public static void main(String[] args) {
		// P RECONHECER VIRGULA NA ENTRADA
		Locale.setDefault(Locale.US);
		
		Scanner scam = new Scanner(System.in);
		//STRING
		/*String x;
		x = scam.next();
		System.out.println("Voce digitou: " + x);
		*/
		
		//INTEIRO
		/*int x;
		x = scam.nextInt();
		System.out.println("Voce digitou: " + x);
		*/
		
		//PONTO FLUTUANTE
		/*double x;
		x = scam.nextDouble();
		System.out.println("Voce digitou: " + x);
		 */
		
		// CARACTERE 1 letra
		/*char x;
		x = scam.next().charAt(0);
		System.out.println("Voce digitou: " + x);
		*/
		
		/*String x;
		int y;
		double z;
		
		x = scam.next();
		y = scam.nextInt();
		z = scam.nextDouble();
		
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		*/
		
		//LER O TEXTO ATE A QUEBRA DE LINHA
		
		String s1, s2, s3;
		s1 = scam.nextLine();
		s2 = scam.nextLine();
		s3 = scam.nextLine();
		
		System.out.println("Dados digitados: ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		scam.close();
	}

}

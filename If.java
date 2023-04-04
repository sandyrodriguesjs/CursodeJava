  package cursoJava;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
	
		System.out.printf("Que horas?");
		int hora = scanner.nextInt();
		
		/*if (hora < 12) {
			System.out.println("Bom dia");
		} else {
			System.out.println("Boa tarde");
		}*/
		
		if (hora < 12) {
			 System.out.println("Bom dia");
		} else {
			if (hora < 18 ) {
				System.out.println("Boa tarde");
			} else {
				System.out.println("Boa noite");
			}
		}
		
		scanner.close();
	}

}

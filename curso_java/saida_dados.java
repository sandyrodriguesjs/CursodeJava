package curso_java;

import java.util.Locale;

public class saida_dados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		/*System.out.print("Olá mundo!");
		System.out.print("Bom dia!");*/
		
		//int y = 25;
		//double x = 10.3578;
		
		//controlar casas decimais
		//System.out.printf("%.2f%n", x);

		//System.out.println(y);
		
		//CONCATENAR
		
		//double idade1 = 22.0;
		//double idade2 = 23.0;
		
		//System.out.println("Robs tem " + idade1 + " anos");
		//System.out.println("Srobs tem " + idade2 + " anos");
		
		
		//CONCATENAR PRINTF
		//System.out.printf("Robs tem %.2f anos e Srobs tem %.2f anos", idade1, idade2);
		
		/*String nome = "Nicolle";
		int idade = 20;
		double renda = 5000.00;
		
		System.out.printf("%s tem %d anos e recebe em torno de %.4f reais", nome, idade, renda);
		*/
		
		String produto1 = "Computer";
		String produto2 = "Office desk";
		
		int idade = 30;
		int codigo = 5290;
		char genero = 'F';
		
		double preco1 = 2100.00;
		double preco2 = 650.50;
		double medida = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s wich price is $%.2f%n", produto1, preco1);
		System.out.printf("%s desk, wich price is $%.2f%n", produto2, preco2);
		
		System.out.printf("%nRecord: %d years old, code %d and gender %s", idade, codigo, genero );
		System.out.printf("%nMeasue with eight decimal places: %.8f", medida);
		System.out.printf("%nRouded (three decimal places): %.3f", medida);
		System.out.printf("%nUS decimal point: %.3f ", medida);
		
	}

}

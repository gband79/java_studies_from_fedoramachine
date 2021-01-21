package fundamentos.operadores;

import java.util.Scanner;

public class DesafioLogico {

	public static void main(String[] args) {
		
				
		Scanner entrada = new Scanner(System.in);
		
		//o wrapper tipo Boolean aqui e utilizado para podermos usar a notacao ponto,
		// com a funcionalidade parseBoolean(), para converter string em boolean.
		// o nextLine() e usado para atribuir o valor da variavel trabalho1 e trabalho2.
		
		System.out.println("Trabalho 1 foi com sucesso ?");
		Boolean trabalho1 = Boolean.parseBoolean(entrada.nextLine());
		System.out.println("Trabalho 1: " + trabalho1);
		
		System.out.println("\nTrabalho 2 foi com sucesso ?");
		Boolean trabalho2 = Boolean.parseBoolean(entrada.nextLine());
		System.out.println("Trabalho 2: " + trabalho2);
		
			if(trabalho1 && trabalho2 == true) {
			System.out.println("\nEntao a familia vai comprar TV50 e tomar sorverte.");
			} else if(trabalho1 || trabalho2 == true) {
				System.out.println("\nEntao a familia vai comprar TV30 e tomar sorverte.");
				} else {
					System.out.println("\nEntao a familia vai ficar em casa, "
							+ "pois nao tem dinheiro suficiente.");
					}
			
		entrada.close();
		

	}

}

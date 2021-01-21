package fundamentos.controle;

import java.util.Scanner;

public class DoWhile {

		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			
			String texto = "";
			
			do {
				System.out.println("Você precisa falar as palavras mágicas...");
				System.out.println("Quer Sair ?");
				texto = entrada.nextLine();
			} while(!texto.equalsIgnoreCase("por favor"));
			
			if(texto.equalsIgnoreCase("por favor")) {
				System.out.println("Até a próxima !");
			}
			entrada.close();
		}
}

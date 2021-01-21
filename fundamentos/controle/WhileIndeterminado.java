package fundamentos.controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		/*
		 * Enquanto a expressão abaixo for verdeadeira
		 * (!valor.equalsIgnoreCase("sair")) -> diferente de "sair"
		 * O programa vai printar na console "Voce diz : "
		 * e será possível digitar qualquer valor no console, 
		 * devido a configuração do objeto scanner... 
		 * valor = entrada.nextLine()
		 * 
		 */ 
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.println("você diz: ");
			valor = entrada.nextLine();
			
			if(valor.equalsIgnoreCase("sair")) {
				System.out.println("Programa encerrado !");
			} 
		}
		
		entrada.close();
	}

}

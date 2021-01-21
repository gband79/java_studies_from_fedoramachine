package fundamentos.controle;

public class ForDeterminado {

	public static void main(String[] args) {
		
		/*
		 * No for a expressão é dividida em 3 partes:
		 * 1 - declaração da variável: (int contador = 1)
		 * 2 - a condição true or false: contador <= 10
		 * 3 - a manipulação da variável de controle: contador++  
		 */
		
		for(int contador = 1; contador <= 10; contador++) {
			System.out.println("I = " + contador);
		}

	}

}

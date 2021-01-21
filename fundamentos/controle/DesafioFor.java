package fundamentos.controle;

public class DesafioFor {
	
	public static void main(String[] args) {
		
		/*
		 * Faca um laço como abaixo:
		 * 
		 *String valor = "#";
		 * for(int i = 1; i <= 5; i++){
		 * 		System.out.println(valor);
		 * 		valor += "#";
		 * }
		 * 
		 * Mas nao poder usar valor numerico pra controlar o laço!
		 * 
		 * o print no console deve apresentar o resultado de hashtags conforme abaixo:
		 * 
		 * #
		 * ##
		 * ###
		 * ####
		 * #####
		 */
		
		for(String i = "#"; !i.equals("######"); i += "#") {
			System.out.println(i);
		}
			
	}
}
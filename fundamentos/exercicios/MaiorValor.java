package fundamentos.exercicios;

import java.util.Scanner;

public class MaiorValor {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int maiorValor = 0;
		int contador = 0;
		
		while(contador != 10) {
			contador++;
			System.out.println("Insira o valor: ");
			int valor = entrada.nextInt();
			
			if(valor > maiorValor) {
				maiorValor = valor;
			}
		}
	System.out.println("O maior valor foi: " + maiorValor);	
	entrada.close();	
	}

}

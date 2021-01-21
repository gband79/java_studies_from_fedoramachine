package fundamentos.exercicios;

import java.util.Scanner;

public class NumPositivoPrintConsole {
	
		
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num = 0;
		int soma = 0;
		
							
		while(num >= 0) {
			System.out.println("\n\nDigite o número a ser somado: ");
			num = entrada.nextInt();
			soma += num;
			
				if(num < 0) {
					System.out.println("Programa encerrado");
					break;
				
				}
		System.out.printf("Soma até o momento: %d", soma);
		
		}
		entrada.close();
	}
}

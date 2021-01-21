package fundamentos.exercicios;

import java.util.Scanner;

public class AdvinhacaoDoNumero {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
				
		int numSecret = 50;
		int tenRest = 10;
		int count = 1;
		
		for(int a = 0; a <= 10; a++) {
			
			System.out.println("\nAdivinhe qual é o número secreto entre 0 e 100: ");
			int num = entrada.nextInt();
			
			tenRest -= count;
			
			if(tenRest == 0) {
				System.out.println("\nQue pena ! Você não adivinhou ! :(");
				break;
			}
												
			if(num != numSecret ) {
				System.out.println("\nErrou ! O número não é "+ num);
				System.out.println("Tentativas restantes: " + tenRest +" tentativas");
					
					if(num > numSecret) {
						System.out.println("\nO número "+ num + " é maior do que o número secreto !");
						}else if(num < numSecret) {
						System.out.println("\nO número "+ num + " é menor do que o número secreto !");
						}		
			}else {
				System.out.println("\nAcertou ! O número secreto é " + numSecret +"! Tu é o cara ! :)");
				break;
			}				
		
		}		
		entrada.close();
	}

}

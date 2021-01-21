package fundamentos.controle;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double nota = 0;
		double total = 0;
		double quantidade = 0;
		
		while(nota != -1) {
			System.out.print("Digite uma nota válida: ");
			nota = entrada.nextDouble();
												
			if(nota <= 10 && nota >= 0) {
				total += nota;
				quantidade++;
			} else if (nota != -1) {
				System.out.println("Nota inválida.");
			}
		
		}
		double media = total / quantidade;
		System.out.println("Média: " + media);
				
		entrada.close();				
	}

}

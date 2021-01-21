package fundamentos.exercicios;

import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite o numero: ");
		double n = entrada.nextDouble();
		
		double rq = Math.pow(n, 2);
		System.out.printf("numero elevado ao quadrado: %.2f", rq);
					
		double rc = Math.pow(n, 3);
		System.out.printf("\nnumero elevado ao cubo: %.2f", rc);
		
		entrada.close();

	}

}

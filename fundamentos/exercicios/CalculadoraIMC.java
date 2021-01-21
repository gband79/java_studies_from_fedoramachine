package fundamentos.exercicios;

import java.util.Scanner;

public class CalculadoraIMC {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe seu peso: ");
		double peso = entrada.nextDouble();
		
		System.out.println("Informe sua altura: ");
		double altura = entrada.nextDouble();
		
		double eq = Math.pow(altura, 2);
		
		double imc = peso / eq;
		
		System.out.printf("IMC: %.2f", imc);
		
		if(imc < 18.5) {
			System.out.println("\nVoce esta abaixo do peso");
		} else if (imc <= 24.9) {
			System.out.println("\nVoce esta no peso normal");
		} else if (imc <= 29.9) {
			System.out.println("\nVoce esta no sobrepeso");
		} else if(imc <= 34.9) {
			System.out.println("\nVoce esta com obesidade grau 1");
		} else if(imc <= 39.9) {
			System.out.println("\nVoce esta com obesidade grau 2");
		}else if(imc >= 40) {
			System.out.println("\noce esta com obesidade grau 3");
		}
			
				
		entrada.close();
	
	}

}

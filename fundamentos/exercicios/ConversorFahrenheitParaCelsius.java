package fundamentos.exercicios;

import java.util.Scanner;

public class ConversorFahrenheitParaCelsius {

	public static void main(String[] args) {
		
		double operador = 5.0 / 9;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a temperatura em Fahrenheit: ");
		double f = entrada.nextDouble();
		
		double celsius = (f - 32) * operador;
		
		System.out.printf("Temperatura em Celsius: %.2f C", celsius);
		
		entrada.close();
	}
	
}

package fundamentos.exercicios;

import java.util.Scanner;

public class ConversorCelciusParaFahrenheit {

	public static void main(String[] args) {
		
		double operador = 9.0/5;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a temperatura em Celsius: ");
		double temp = entrada.nextDouble();
		
		double fahrenheit = (temp * operador) + 32;
		
		System.out.println("Temperatura em Fahrenheit: " + fahrenheit +"F");
		
		entrada.close();
		
		
	}

}

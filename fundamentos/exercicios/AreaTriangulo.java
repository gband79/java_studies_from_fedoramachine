package fundamentos.exercicios;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("base: ");
		double b = entrada.nextDouble();
		
		System.out.println("altura: ");
		double alt = entrada.nextDouble();
		
		double areaTriangulo = (b * alt) / 2;
		System.out.println("Area do triangulo: " + areaTriangulo);
		
		entrada.close();
		
	}

}

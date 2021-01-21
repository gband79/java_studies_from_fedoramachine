package fundamentos.exercicios;

public class Bhaskara {

	public static void main(String[] args) {
		/*
		 * equações do segundo grau (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara. 
		 * Use como exemplo a = 1, b = 12 e c = -13. 
		*/
		int a = 1;
		int b = 12;
		int c = -13;
		
		int delta = (int) Math.pow(b, 2) - (4 * a * c); 
		System.out.println(delta);
		
		double num = -b + Math.sqrt(delta);
		double den = 2 * a;
		System.out.println("x' = " + num / den);
		
		double num2 = -b - Math.sqrt(delta);
		double den2 = 2 * a;
		System.out.println("x'' = " + num2 / den2);
	}

}

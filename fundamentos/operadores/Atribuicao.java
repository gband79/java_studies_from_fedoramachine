package fundamentos.operadores;

public class Atribuicao {

	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b; // Atribuição aditiva é o mesmo que: c = c + b;
		c -= a; // Atribuição subtrativa é o mesmo que: c = C - a;
		c *= b; // Atribuição multiplicativa é o mesmo que: c = C * b;
		c /= a; // Atribuição divisiva é o mesmo que : c = C / a;
		
		System.out.println(c);
		
		c %= 2; //é o mesmo que : c = C %= 2; O resultado é o resto da divisão de c por 2, que é 0.
		System.out.println(c);

	}

}

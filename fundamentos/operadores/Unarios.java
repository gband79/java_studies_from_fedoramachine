package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // pós incremento a = a + 1;
		a--; // pós decremento a = a -1;
		
		++b; // pre incremento b = b + 1;
		--b; // pre decremento b = b - 1;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("\nMini desafio: você acha que "
				+ "no print abaixo: (++a == b--), 'a' é igual a 'b'?");
		
		System.out.println("Resposta: " + (++a == b--));
		
		System.out.println("\nE agora?  No próximo print (a == b), 'a' é igual a 'b'?");
		System.out.println("Resposta: " + (a == b));
		
		System.out.println("\n" + a);
		System.out.println(b);
		

	}

}

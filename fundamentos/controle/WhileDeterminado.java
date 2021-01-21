package fundamentos.controle;

public class WhileDeterminado {

	public static void main(String[] args) {
		 /*
		 * Este while é determinado pq sabemos pelo contador quantas vezes será repetido 
		 * (20 vezes).
		 * O incremento de 2 (contador "+= 2") mostrará todos os valores pares até 20.
		 */
		int contador = 0;
		
		while(contador <=20) {
			System.out.printf("\ni = %d", contador);
			contador += 2;
		}

	}

}

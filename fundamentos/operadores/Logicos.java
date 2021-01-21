package fundamentos.operadores;

public class Logicos {
	
	public static void main(String[] args) {
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2); //ambos tem que ser verdadeiros para dar verdadeiro
		System.out.println(condicao1 || condicao2); //um dos doi tem que ser verdadeiro para dar verdadeiro
		System.out.println(condicao1 ^ condicao2); //precisa ter uma verdadedeiro e uma falso para dar verdadeiro
		System.out.println(!!condicao1); //verdadeiro
		System.out.println(!condicao2); //"not false" (verdadeiro)
		
		
		System.out.println("\nTabela Verdade E (AND)");
		System.out.println(true && true);
		System.out.println(true && false);
		//System.out.println(false && true); "Dead code"
		//System.out.println(false && false); "Dead code"
		
		System.out.println("\nTabela Verdade OU (OR)");
		//System.out.println(true || true); "Dead code"
		//System.out.println(true || false); "Dead code"
		System.out.println(false || true);
		System.out.println(false || false);

		System.out.println("\nTabela Verdade OU Exclusivo (XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
	}
}

package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
	
	/*
	 * Modelo de operador ternario padrao:	
	 * 
	 * String resultadoFinal = media >= 7.0 ? "Aprovado" : "reprovado";
	 * 
	 * Abaixo, foi utilizado uma segundo operador ternario (media >= 5.0 ? "de recuperação." 
	 * : "reprovado.") com uma nova condicao. Se a media for maior ou igual a 5, 
	 * o aluno entra em recuperacao, caso true. Caso false, ele esta reprovado.
	 *  
	 */

	double media = 3.0;
	String resultadoFinal = media >= 7.0 ? "aprovado." : media >= 5.0 ? "de recuperação." : "reprovado."; 
	System.out.println("O aluo está " + resultadoFinal);
	
	double nota = 9.9;
	boolean bomComportamento = false;
	boolean passouPorMedia = nota >= 7;
	boolean temDesconto = bomComportamento && passouPorMedia;
	String resultado = temDesconto ? "Sim." : "Não."; // operador ternario
	System.out.printf("Tem desconto? %s",  resultado); 
	}

}

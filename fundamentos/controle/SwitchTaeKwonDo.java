package fundamentos.controle;

import java.util.Scanner;

public class SwitchTaeKwonDo {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
			System.out.println("Qual é a sua faixa ?");
			String faixa = entrada.next();
			
			switch(faixa) {
			
			case "branca" :
				System.out.println("Dominar o Saju Tchirigui e Saju Ap Tchagui");
				break;
				
			case "amarela" : 
				System.out.println("Dominar até o Tageuk Il Jang");
				break;
				
			case "amarela ponta verde" :
				System.out.println("Dominar até o Taguk I Jang ");
				break;
				
			case "verde" :
				System.out.println("Dominar até o Taeguk San Jang");
				break;
				
			case "verde ponta azul" :
				System.out.println("Dominar até o Taeguk Sa Jang");
				break;
				
			case "azul" :
				System.out.println("Dominar até o Taeguk O Jang");
			
			case "azul ponta vermelha" :
				System.out.println("Dominar até o Taeguk Yuk Jang");
				break;
				
			case "vermelha" :
				System.out.println("Dominar até o Taeguk Tchil Jang");
				break;
				
			case "vermelha ponta preta" :
				System.out.println("Dominar até o Taeguk Pal Jang");
				break;
				
			case "preta" :
				System.out.println("Dominar até o Koryo");
			
			default :
				System.out.println("Não pratico Tae Kwon Do.");
			}
						
		entrada.close();
			
	}
			
	

}

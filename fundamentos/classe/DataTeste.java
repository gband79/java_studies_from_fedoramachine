package fundamentos.classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 2;
		d1.mes = "Novembro";
		d1.ano = 1909;
		
		Data d2 = new Data();
		d2.dia = 16;
		d2.mes = "Junho";
		d2.ano = 1954;
		
		System.out.println("Tia Bá nasceu em "+d1.dia + " de " + d1.mes + " de " + d1.ano + ".");
		System.out.println("Minha mãe naceu em " + d2.dia + " de " + d2.mes + " de " + d2.ano + ".");
	}
}

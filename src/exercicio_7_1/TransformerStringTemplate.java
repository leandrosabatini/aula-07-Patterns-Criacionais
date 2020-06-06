package exercicio_7_1;

public abstract class TransformerStringTemplate {
	public final void tranformar(String s) {
		alterarString(s);
	}
	
	public void alterarString(String s) {
		System.out.println("Convertido: " + s);
	}
}

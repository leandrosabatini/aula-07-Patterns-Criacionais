package exercicio_7_1;

public class TransformerDuplicate extends TransformerStringTemplate {
	@Override
	public void alterarString(String s) {
		System.out.println("Convertido: " + s + " " + s);
	}
}

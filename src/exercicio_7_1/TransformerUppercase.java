package exercicio_7_1;

public class TransformerUppercase extends TransformerStringTemplate {
	@Override
	public void alterarString(String s) {
		s = s.toUpperCase();
		
		System.out.println("Convertido: " + s);
	}
}

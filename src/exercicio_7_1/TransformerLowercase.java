package exercicio_7_1;

public class TransformerLowercase extends TransformerStringTemplate {
	@Override
	public void alterarString(String s) {
		s = s.toLowerCase();
		
		System.out.println("Convertido: " + s);
	}
}

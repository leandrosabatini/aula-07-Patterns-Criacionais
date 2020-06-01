package exercicio_1_1;

public class ImpressoraProducer {
	public static final int TELA = 1;
	public static final int ARQUIVO = 2;
	
	private ImpressoraProducer() {
		throw new AssertionError();
	}
	
	public static Impressora getImpressora(int tipo) {
		switch(tipo) {
		case TELA:
			return new ImpressoraTela();
		case ARQUIVO:
			return new ImpressoraArquivo();
		}
		return null;
	}

	public static Impressora getRandomImpressora() {
	    int randomInt = (int) (Math.random() * 2 + 1);
	    
	    return getImpressora(randomInt);
	}
}

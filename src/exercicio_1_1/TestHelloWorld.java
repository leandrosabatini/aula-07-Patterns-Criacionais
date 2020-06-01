package exercicio_1_1;

public class TestHelloWorld {
	public static void main(String[] args) {
		Impressora impressora = ImpressoraProducer.getRandomImpressora();
		impressora.imprimir();
	}
}

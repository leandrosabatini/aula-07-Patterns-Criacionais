package exercicio_1_1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ImpressoraArquivo implements Impressora {
	@Override
	public void imprimir() {
		FileWriter arq;
		try {
			arq = new FileWriter("output.txt");
			PrintWriter gravarArq = new PrintWriter(arq);
			gravarArq.printf("Hello, World");
			gravarArq.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

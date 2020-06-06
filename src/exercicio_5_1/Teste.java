package exercicio_5_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Teste {
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("exercicio_5_1/teste.txt");
		
		IOFacade ioFacade = new IOFacade(is);
		
		ioFacade.ReadFile();
	}
}

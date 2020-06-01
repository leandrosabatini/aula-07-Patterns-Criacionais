package exercicio_2_3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileLogger implements Logger {
	@Override
	public void log(String log) {
		FileWriter arq;
		try {
			arq = new FileWriter("log.txt", true);
			PrintWriter gravarArq = new PrintWriter(arq);
			gravarArq.println(log);
			gravarArq.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

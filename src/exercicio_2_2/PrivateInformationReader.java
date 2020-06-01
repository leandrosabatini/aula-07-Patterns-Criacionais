package exercicio_2_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.stream.Collectors;

public class PrivateInformationReader implements InformationReader {
	@Override
	public String read() {
		FileReader fr;
		try {
			fr = new FileReader("exercicio_2_2/confidencial.txt");
			BufferedReader buffRead = new BufferedReader(fr);
			String content =  buffRead.lines().collect(Collectors.joining());
			buffRead.close();

			return content;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
}

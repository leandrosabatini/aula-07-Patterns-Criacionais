package exercicio_2_3;

public class Contador {
	public static void main(String[] args) throws Exception {
		LoggerService service;

		try {
			if ("arquivo".equals(args[0])) {
				service = new FileLoggerService();
			} else if ("console".equals(args[0])) {
				service = new ConsoleLoggerService();
			} else {
				throw new Exception("Parâmetro inserido desconhecido, insira 'arquivo' ou 'console'");
			}
		} catch (Exception e) {
			throw new Exception("Insira o parâmetro (arquivo ou console)");
		}
		
		for (int i = 1; i <= 10; i++) {
			service.log(i + "");
		}
	}
}

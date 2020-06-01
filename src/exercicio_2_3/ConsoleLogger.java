package exercicio_2_3;

public class ConsoleLogger implements Logger {
	@Override
	public void log(String log) {
		System.out.println(log);
	}
}

package exercicio_2_3;

public class ConsoleLoggerService extends LoggerService {
	@Override
	protected Logger getLogger() {
		return new ConsoleLogger();
	}
}

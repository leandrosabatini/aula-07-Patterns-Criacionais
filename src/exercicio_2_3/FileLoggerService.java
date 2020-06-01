package exercicio_2_3;

public class FileLoggerService extends LoggerService {
	@Override
	protected Logger getLogger() {
		return new FileLogger();
	}
}

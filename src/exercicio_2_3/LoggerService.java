package exercicio_2_3;

public abstract class LoggerService {
	public void log(String log) {
		Logger logger = getLogger();
		logger.log(log);
	}
	
	protected abstract Logger getLogger();
}

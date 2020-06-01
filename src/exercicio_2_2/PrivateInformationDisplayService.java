package exercicio_2_2;

public class PrivateInformationDisplayService extends DisplayService {
	@Override
	protected InformationReader getInformationReader() {
		return new PrivateInformationReader();
	}
}

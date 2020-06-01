package exercicio_2_2;

public class PublicInformationDisplayService extends DisplayService {
	@Override
	protected InformationReader getInformationReader() {
		return new PublicInformationReader();
	}
}

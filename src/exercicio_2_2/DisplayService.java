package exercicio_2_2;

public abstract class DisplayService {

	public void display() {
		InformationReader infoReader = getInformationReader();
		String information = infoReader.read();
		System.out.println(information);
	}
	
	protected abstract InformationReader getInformationReader();
}

package exercicio_2_2;

public class VisualizarInformacoes {
	public static void main(String args[]) {
		DisplayService service;

		if ("desi gnpatt er ns".equals(args[0])) {
			service = new PrivateInformationDisplayService();
			service.display();
		} else {
			service = new PublicInformationDisplayService();
			service.display();
		}
	}
}

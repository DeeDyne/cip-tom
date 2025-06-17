package hello_world;

public class FactoryCampanelli {

	public static Campanello creaCampanello(String tipo) {
		switch (tipo.toLowerCase()) {
		case "casa":
			return new Campanello("Campanello di casa", "Ding Dong!");
		case "negozio":
			return new Campanello("Campanello del negozio", "Trin Trin!");
		default:
			return null; // oppure lancia un'eccezione se vuoi
		}
	}
}
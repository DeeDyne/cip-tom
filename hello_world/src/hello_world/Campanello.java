package hello_world;

public class Campanello {
	
	private String suono;

	public Campanello(String nome, String suono) {
		
		this.suono = suono;
	}

	public void suona() {
		System.out.println(suono);
	}
}
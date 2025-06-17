package hello_world;

class Campanello {
	private String nome;
	private String suono;

	public Campanello(String nome, String suono) {
		this.nome = nome;
		this.suono = suono;
	}

	public void suona() {
		System.out.println(nome + " fa: " + suono);
	}
}
package hello_world;

public class CampanelloAdapter implements CampanelloMultiplo {

	private Campanello campanello;

	public CampanelloAdapter(Campanello campanello) {
		this.campanello = campanello;
	}

	@Override
	public void suonaTreVolte() {
		for (int i = 0; i < 3; i++) {
			campanello.suona();
		}
	}
}
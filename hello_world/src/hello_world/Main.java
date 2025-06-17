package hello_world;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world!");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Premi 1 per suonare il campanello di casa.");
		System.out.println("Premi 2 per suonare il campanello del negozio.");
		System.out.print("Scelta: ");

		int scelta = scanner.nextInt();

		Campanello campanello = null;
		if (scelta == 1) {
			campanello = FactoryCampanelli.creaCampanello("casa");
		} else if (scelta == 2) {
			campanello = FactoryCampanelli.creaCampanello("negozio");
		} else {
			System.out.println("Scelta non valida.");
		}

		if (campanello != null) {
			campanello.suona();
		}

		scanner.close();
	}
}
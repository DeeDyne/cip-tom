package hello_world;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hello world!");
		
        Scanner scanner = new Scanner(System.in);

        Campanello campanello1 = new Campanello("Campanello di casa", "Ding Dong!");
        Campanello campanello2 = new Campanello("Campanello del negozio", "Trin Trin!");

        System.out.println("Premi 1 per suonare il campanello di casa.");
        System.out.println("Premi 2 per suonare il campanello del negozio.");
        System.out.print("Scelta: ");

        int scelta = scanner.nextInt();

        if (scelta == 1) {
            campanello1.suona();
        } else if (scelta == 2) {
            campanello2.suona();
        } else {
            System.out.println("Scelta non valida.");
        }

        scanner.close();
    }
	

}

package br.fai.ex06;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}
	
	private void start() {
		ArrayList<String> carros = new ArrayList<String>();
		carros.add("civic");
		carros.add("gol");
		carros.add("palio");
		carros.add("uno");
		
		int i = 0;
		while (i < 4) {
			System.out.println(carros.get(i));
			i += 1;
		}
		
		carros.set(1, "L200");
		System.out.println();
		for (int j = 0; j < 4; j++) {
			System.out.println(carros.get(j));
		}
		
		carros.set(3, "gol");
		System.out.println();
		for (int j = 0; j < 4; j++) {
			System.out.println(carros.get(j));
		}		
	}
}

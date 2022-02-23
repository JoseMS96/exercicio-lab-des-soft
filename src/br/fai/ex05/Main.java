package br.fai.ex05;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}
	
	private void start() {
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Entre com o valor desta iteração.");
			int valor = scanner.nextInt();
			switch(valor) {
				case 1:
					System.out.println("Primeira condição.");
					break;
				case 4: 
					System.out.println("Segunda condição.");
					break;
				default:
					System.out.println("Não encontrou uma condição.");
			}
		}
	}
}


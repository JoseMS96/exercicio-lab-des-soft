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
			System.out.println("Entre com o valor desta itera��o.");
			int valor = scanner.nextInt();
			switch(valor) {
				case 1:
					System.out.println("Primeira condi��o.");
					break;
				case 4: 
					System.out.println("Segunda condi��o.");
					break;
				default:
					System.out.println("N�o encontrou uma condi��o.");
			}
		}
	}
}


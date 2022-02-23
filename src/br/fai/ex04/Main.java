package br.fai.ex04;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}
	
	private void start() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com o valor de iteração: ");
		int iteracao = scanner.nextInt();
		
		int i = 0;
		while (i < 20) {
			System.out.println("Valor i: " + iteracao);
			i += 1;
		}	
	}
}
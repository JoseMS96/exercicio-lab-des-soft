package br.fai.ex01;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();
		app.start();
	}
	
	private void start() {
		int idade = 15;
		System.out.println("A idade é de " + idade + "anos.");
		
		int Result1 = (15 + 5) * 2;
		System.out.println("Resultado 1: " + Result1);
		int Result2 = 15 - 5;
		System.out.println("Resultado 2: " + Result2);
		
		if (idade > 20) {
			System.out.println("A idade é maior que 20.");
		} else {
			System.out.println("A idade é menor que 20.");
		}	
	}
}
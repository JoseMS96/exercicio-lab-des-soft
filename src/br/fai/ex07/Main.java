package br.fai.ex07;


public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}
	
	private void start() {
		calcular(5, 5);
		calcular(10.27, 10.42);
		calcular("44", " um texto qualquer");
	}

	private void calcular(int valor1, int valor2) {
		int resultado = valor1 + valor2;
		System.out.println("Resultado da operacao: " + resultado);
	}
	
	private void calcular(double valor1, double valor2) {
		double resultado = valor1 - valor2;
		System.out.println("Resultado da operacao: " + resultado);		
	}
	
	private void calcular(String valor1, String valor2) {
		String resultado = valor1 + valor2;
		System.out.println("Resultado da operacao: " + resultado);		
	}
}

package br.fai.ex02;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();
		app.start();
	}
	
	private void start() {
		Scanner scanner = new Scanner(System.in);
		double productvalue;
		
		System.out.println("Digite o valor do produto: ");
		productvalue = scanner.nextDouble();
		
		
		int intproductvalue = (int)productvalue;
		System.out.println("Valor com casas decimais: " + productvalue + "\nValor inteiro: " + intproductvalue);
		
		int i = 10;
		System.out.println("\nNovo: " + i);
		double d = i;
		System.out.println("Convertido: " + d);

		int ii = (int) d; // Double "d" sendo convertido para int dentro da variavel "ii" de forma explicita.
	}
}
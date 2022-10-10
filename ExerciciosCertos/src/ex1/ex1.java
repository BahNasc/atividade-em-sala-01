package ex1;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		try (//Leitura de dados - declarar apenas 1 vez
		Scanner leitura = new Scanner(System.in)) {
			String nome = leitura.nextLine();
			System.out.println(nome);
		}


	}

}

package ex4;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
		System.out.println("Digite um número: ");
		Integer num = Integer.valueOf(leitura.nextLine());
		System.out.println(num);

	}

 }

}

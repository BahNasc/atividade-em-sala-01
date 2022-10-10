package ex3;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		//3. Faça um programa para ler uma variável (tipo inteiro) usando Scanner. Exiba no console se este inteiro
		//é par ou não. Lembre-se: você terá que fazer uma conversão de tipo (casting).

		Scanner leitura = new Scanner(System.in);
		Integer num = Integer.valueOf(leitura.nextLine());
		
		if(num % 2 == 0)
			System.out.println("É par !");

			else
			System.out.println("É impar!");
		
	}

}

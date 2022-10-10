package ex9;

import java.util.Scanner;

public class ex9 {
	  Scanner s = new Scanner(System.in);
	    
	    System.out.println("Insira quantidade de litros: ");
	    String qtdLitros = s.nextLine();
	    System.out.println("Insira preço litro: ");
	    String precoLitro = s.nextLine();
	    
	    Double qtd = Double.valueOf(qtdLitros);
	    Double preco = Double.valueOf(precoLitro);
	    
	    Double valorTotal = calculaAbastecimento(qtd, preco);
	    System.out.println("Valor total: " + valorTotal);
		
		private static Double calculaAbastecimento(Double qtd, Double preco) {
			return qtd * preco;
   }
}
		

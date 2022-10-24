package pratica17;

import java.util.ArrayList;

public class AnimalMain {

	public static void main(String[] args) {
		ArrayList<Gato> gatinhos = new ArrayList<>();
		
		Gato gato1 = new Gato();
		gato1.setNome("fofin");
		gato1.setNumerodePatas(4);
		gato1.setRaca("vira-lata");
		gato1.setEcossistema("Casa");
		gato1.setCor("Preto");
		gato1.setComprimento(20.0f);
		gatinhos.add(gato1);

		Gato gato2 = new Gato();
		gato2.setNome("Martim");
		gato2.setNumerodePatas(4);
		gato2.setRaca("siames");
		gato2.setEcossistema("casa");
		gato2.setCor("Preto");
		gato2.setComprimento(23.0f);
		gatinhos.add(gato2);
		
		Gato gato3 = new Gato();
		gato3.setNome("Batatinha");
		gato3.setNumerodePatas(4);
		gato3.setRaca("vira-lata");
		gato3.setEcossistema("Casa");
		gato3.setCor("preto");
		gato3.setComprimento(26.0f);
		gatinhos.add(gato3);
		
		ArrayList<Cachorro> cachorrinhos = new ArrayList<>();
		
		Cachorro cachorro1 = new Cachorro();
		cachorro1.setNome("Jack");
		cachorro1.setNumerodePatas(4);
		cachorro1.setRaca("Salsicha");
		cachorro1.setEcossistema("Casa");
		cachorro1.setCor("marrom");
		cachorro1.setComprimento(60.0f);
		cachorrinhos.add(cachorro1);
		
		Cachorro cachorro2 = new Cachorro();
		cachorro2.setNome("Bob");
		cachorro2.setNumerodePatas(4);
		cachorro2.setRaca("Pastor Alemão");
		cachorro2.setEcossistema("apartamento");
		cachorro2.setCor("Preto com Marrom");
		cachorro2.setComprimento(70.0f);
		cachorrinhos.add(cachorro2);
		
		Cachorro cachorro3 = new Cachorro();
		cachorro3.setNome("flopio");
		cachorro3.setNumerodePatas(4);
		cachorro3.setRaca("Pit Bull");
		cachorro3.setEcossistema("Casa");
		cachorro3.setCor("Cinza");
		cachorro3.setComprimento(60.0f);
		cachorrinhos.add(cachorro3);
		
		for (Gato gato : gatinhos) {
			System.out.println(gato.getNome());
			System.out.println(gato.getNumerodePatas());
			System.out.println(gato.getRaca());
			System.out.println(gato.getEcossistema());
			System.out.println(gato.getCor());
			System.out.println(gato.getComprimento());
		}
		
		for (Cachorro cachorro : cachorrinhos) {
			System.out.println(cachorro.getNome());
			System.out.println(cachorro.getNumerodePatas());
			System.out.println(cachorro.getRaca());
			System.out.println(cachorro.getEcossistema());
			System.out.println(cachorro.getCor());
			System.out.println(cachorro.getComprimento());
		}
	}

}
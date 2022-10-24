package pratic;

public class MainPessoa {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		Aluno al = new Aluno();
		Professor pr = new Professor();
		
		p.setCpf("12273499981");
		p.setNome("claudio");
		al.setMatricula(123456);
		pr.setSiape(1234);
		
		System.out.println(p.getCpf());
		System.out.println(p.getNome());
		System.out.println(al.getMatricula());
		System.out.println(pr.getSiape());
		
	}

}

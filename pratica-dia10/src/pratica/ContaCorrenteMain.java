package pratica;


public class ContaCorrenteMain {

	public static void main(String[] args) {
    ContaCorrente c = new ContaCorrente();
    
    c.nomedoTitular = "Bárbara";
    c.cpf = 12273499981l;
    c.NumerodaConta = 123456l;
    c.saldo = 10.0;
	
    c.mostrarDados();
    c.depositar(50.0);
    c.sacar(10.0);
    
    c.mostrarDados();
	}

}

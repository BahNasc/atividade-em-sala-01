package pratica;


public class ContaCorrente {

	public String nomedoTitular;
	public Long cpf;
	public Long NumerodaConta;
	public Double saldo; 

	public void mostrarDados() {
		System.out.println("Títular" + nomedoTitular);
		System.out.println("Cpf" + cpf);
		System.out.println("Conta" + NumerodaConta);
		System.out.println("Saldo" + saldo);
	}
	
	public void depositar(Double valordoDeposito) {
		saldo = saldo + valordoDeposito;
	}
	
	public Double sacar(Double valordoSaque) {
		double retornodoSaque = 0;
		if(valordoSaque > saldo) {
			System.out.println("Saldo insuficiente");
		}else {
			saldo = saldo - valordoSaque;
			retornodoSaque = valordoSaque;
		}
		return retornodoSaque;
	}
	}



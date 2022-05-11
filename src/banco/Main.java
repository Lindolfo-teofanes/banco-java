package banco;

public class Main {

	public static void main(String[] args) {
		Cliente lindolfo = new Cliente();
		lindolfo.setNome("Lindolfo");
		
		Conta cc = new ContaCorrente(lindolfo);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(lindolfo);
		
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}

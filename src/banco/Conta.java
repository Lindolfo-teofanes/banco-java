package banco;


public abstract class Conta implements IConta{

	protected static final int AGENCIA_PADRAO = 0001;
	private static int SEQUENCIAL = 1;
	
	protected int agencia; 
	protected int numero;
	protected double saldo;	
	protected Cliente cliente;
	
	protected void imprimirInfosComuns() {
		System.out.println("Titular: " + this.cliente.getNome());
		System.out.println("Agencia: " + this.agencia);
		System.out.println("Conta: "+ this.numero);
		System.out.println("Saldo: "+ this.saldo);
	}

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public void sacar(double valor) {
	
		this.saldo -= valor;
		
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
		
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	

	
}

package modulo03;

class Conta {
	private String numero;
	private double saldo;
	private double limite;
	private Cliente cliente;
	
	public Conta (String numero, Cliente cliente) {
		this.numero = numero;
		this.saldo = 0;
		this.limite = 400;
		this.cliente = cliente;
	}
	
	public String toString() {
		return this.numero;
	}
	
	protected String getNumero() {
		return this.numero;
	}
	
	protected double getSaldo() {
		return this.saldo;
	}
	
	protected double getLimite() {
		return this.limite;
	}
	
	protected void setNumero (String numero) {
		this.numero = numero;
	}
	
	protected void setSaldo (double valor) {
		this.saldo = valor;
	}
	
	protected void setLimite (double valor) {
		this.limite = valor;
	}
	
	protected boolean creditar(double valor) {
		boolean success = false;
		
		this.saldo += valor;
		success = true;
		
		return success;
	}
	
	protected boolean debitar (double valor) {
		boolean success = false;
		
		if (valor > 0 && valor <= this.saldo) {
			this.saldo -= valor;
			success = true;
		}
		return success;
	}
	
	protected boolean transferir (double valor, Conta conta) {
		boolean success = false;
		
		if (this.debitar(valor)){
			conta.creditar(valor);
			success = true;
		}
		
		return success;
	}
	
	
	protected void getStatus() {
		System.out.println("========== Status da conta ==========");
		System.out.println("Numero: " + this.numero);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Limite: " + this.limite);
		System.out.println("Cliente: " + this.cliente);
		System.out.println("=====================================");
	}
}

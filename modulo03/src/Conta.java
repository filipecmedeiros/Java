
class Conta {
	private String numero;
	private double saldo;
	private double limite;
	private Cliente cliente;
	
	protected Conta(String numero, double saldo, double limite, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.cliente = cliente;
	}
	
	protected void printConta() {
		System.out.println("=========== Conta ===========");
		System.out.println("Número:" + this.numero);
		System.out.println("Saldo:" + this.saldo);
		System.out.println("Limite:" + this.limite);
		System.out.println("Cliente:" + this.cliente);
		System.out.println("=============================");
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
	
	protected Cliente getCliente() {
		return this.cliente;
	}
	
	protected boolean creditar(double valor) {
		
		boolean sucesso = false;
		
		if (this.saldo + valor <= limite) {
			this.saldo += valor;
			sucesso = true;
		}
		else {
			System.out.println("Não é possível creditar este valor");
		}
		return sucesso;
	}
	
	protected boolean debitar(double valor) {
		
		boolean sucesso = false;
		
		if (this.saldo>=valor) {
			this.saldo -= valor;
			sucesso = true;
		}
		else {
			System.out.println("Não é possível debitar este valor");
		}
		return sucesso;
	}
	
	protected boolean transferir (Conta destino, double valor) {
		
		boolean sucesso = false;
		boolean debitar = this.debitar(valor);
		boolean creditar = destino.creditar(valor);
		if (debitar && creditar) {
			sucesso = true;
		}
		else {
			if (debitar == false && creditar == true) {
				destino.debitar(valor);
			}
			else if (debitar == true && creditar == false){
				this.creditar(valor);
			}
			System.out.println("Não foi possível realizar a transferência");
		}
		return sucesso;
	}
}

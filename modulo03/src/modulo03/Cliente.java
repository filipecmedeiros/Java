package modulo03;

class Cliente {
	private String cpf;
	private String nome;
	
	public Cliente (String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public String toString () {
		return this.cpf;
	}
	
	protected String getCpf() {
		return this.cpf;
	}
	
	protected String getNome() {
		return this.nome;
	}
	
	protected boolean setCpf(String novoCpf) {
		this.cpf = novoCpf;
		return true;
	}
	
	protected boolean setNome(String novoNome) {
		this.nome = novoNome;
		return true;
	}
}

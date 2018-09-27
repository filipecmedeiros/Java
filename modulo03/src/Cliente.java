
public class Cliente{
	private String nome;
	private String cpf;
	
	protected Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	protected String getNome() {
		return this.nome;
	}
	protected String getCpf() {
		return this.cpf;
	}
	
	public String toString() {
		return this.cpf;
	}
}

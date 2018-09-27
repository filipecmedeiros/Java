
public class Main {

	public static void main (String args[]) {
		Cliente p1, p2, p3;
		Conta c1, c2, c3;
		
		p1 = new Cliente ("Pessoa 1", "000.000.000-00");
		p2 = new Cliente ("Pessoa 2", "111.111.111-11");
		p3 = new Cliente ("Pessoa 3", "000.000.000-00");
		
		c1 = new Conta("000-0", 0, 1000, p1, TipoCliente.NORMAL);
		c2 = new Conta("111-1", 100, 2000, p2, TipoCliente.ESPECIAL);
		c3 = new Conta("222-2", 500, 10000, p1, TipoCliente.OURO);
		
		c1.creditar(400);
		c2.debitar(200);
		c2.debitar(100);
		c1.transferir(c3, 400);
		
		
		RepositorioConta repConta = new RepositorioConta();
		repConta.inserir(c1);
		repConta.inserir(c2);
		repConta.inserir(c3);
		repConta.remover(c2);
		repConta.printRepositorio();
		
	
	}
}

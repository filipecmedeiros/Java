
public class Main {

	public static void main (String args[]) {
		Cliente p1, p2;
		Conta c1, c2, c3;
		
		p1 = new Cliente ("Pessoa 1", "000.000.000-00");
		p2 = new Cliente ("Pessoa 2", "111.111.111-11");
		
		c1 = new Conta("000-0", 0, 1000, p1);
		c2 = new Conta("111-1", 100, 2000, p2);
		c3 = new Conta("222-2", 500, 10000, p1);
		
		c1.creditar(400);
		c2.debitar(200);
		c2.debitar(100);
		c1.transferir(c3, 400);
		c1.printConta();
		c2.printConta();
		c3.printConta();
	}
}

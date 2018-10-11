package modulo03;

public class Main {
	public static void main (String[] args) {
		Cliente fulano, beltrano, sicrano;
		
		fulano = new Cliente ("000.000.000-00", "Fulano");
		beltrano = new Cliente ("111.111.111-11", "Beltrano");
		sicrano = new Cliente ("222.222.222-22", "Sicrano");
		
		Conta c1, c2, c3;
		c1 = new Conta("000.000-00", fulano);
		c2 = new Conta("123.123-00", beltrano);
		c3 = new Conta("999.999-99", sicrano);
		
		c1.creditar(100);
		c2.creditar(1000);
		c3.creditar(2500);
		c3.transferir(500, c1);
		c2.debitar(400);
		
		c1.getStatus();
		c2.getStatus();
		c3.getStatus();
	
	}
}

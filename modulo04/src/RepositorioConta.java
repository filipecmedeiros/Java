
public class RepositorioConta {
	Conta[] contas = new Conta [100];
	int tamanho = 0;
	
	protected boolean inserir (Conta nova){
		boolean sucess = false;
		
		if (this.tamanho < this.contas.length) {
			this.contas[tamanho] = nova;
			this.tamanho++;
			sucess = true;
		}
		else {
			System.out.println("Não é possível inserir uma nova conta");
		}
		
		return sucess;
	}
	
	protected int pesquisar(String numero) {
		int i = -1;
		
		for (i=0; i<this.tamanho; i++) {
			if (this.contas[i].getNumero() == numero){
				break;
			}
		}
		
		return i;
	}
	
	protected boolean remover (Conta rem) {
		boolean sucess = false;
		int j;
		int i = this.pesquisar(rem.getNumero());
		
		if (i >= 0){
			do {
				j = i+1;
				this.contas[i] = this.contas[j];
				i++;
				j++;
			}while(i<=this.tamanho);
			
			this.tamanho--;
		}
		
		
		return sucess;
	}
	
	protected void printRepositorio() {
		for (int i = 0; i<this.tamanho; i++) {
			this.contas[i].printConta();
		}
	}

}

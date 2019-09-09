package udc.edu.exercicio2_6;

public class Naturais {
	
	private int numero;

	public Naturais() {
		numero = 0;
	}	
	public Naturais(int numero) {
		super();
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	public int somarNumeros(int quantidade) {
		int aux = 0;
		for(int i = 0; i < quantidade; i++) {
			numero = numero + (aux + 1);
			aux += 2;
		}
		return numero;
	}
	
}

package udc.edu.exercicio1_7;

public class Contador {
	
	private int contador;
		
	public Contador() {
		this.setContador(0);
	}
	public Contador(int contador) {
		super();
		this.contador = contador;
	}

	private int getContador() {
		return contador;
	}
	private void setContador(int contador) {
		this.contador = contador;
	}
	
	
	public void zerarContador() {
		this.setContador(0);
	}
	
	public void incrementarContador() {
		this.setContador(this.getContador()+1);
	}
	
	public int retornarValor() {
		return this.getContador();
	}

}

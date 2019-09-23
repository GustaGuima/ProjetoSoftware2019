package udc.edu.exercicio4_3;

public class Numerico {

	private int numero;

	
	
	public Numerico() {
	}
	public Numerico(int numero) {
		super();
		this.numero = numero;
	}

	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int novoX() {
		if(numero == 1) {
			System.out.println(numero);
			return numero;
		}
		if(numero % 2 == 0) {
			numero = numero / 2;
			System.out.println(numero);
			novoX();
		}else {
			numero = 2 * numero / 3 + 1;
			System.out.println(numero);
			novoX();
		}
		return numero;
	}
	
}

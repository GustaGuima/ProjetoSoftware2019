package udc.edu.exercicio7_3;

public class Quadrilatero {
	
	private Ponto2d a;
	private Ponto2d b;
	private Ponto2d c;
	private Ponto2d d;
	
	public Quadrilatero() {
	}

	public Quadrilatero(Ponto2d ponto1, Ponto2d ponto2, Ponto2d ponto3, Ponto2d ponto4) {
		super();
		this.a = ponto1;
		this.b = ponto2;
		this.c = ponto3;
		this.d = ponto4;
	}

	public Ponto2d getA() {
		return a;
	}
	public void setA(Ponto2d a) {
		this.a = a;
	}

	public Ponto2d getB() {
		return b;
	}
	public void setB(Ponto2d b) {
		this.b = b;
	}

	public Ponto2d getC() {
		return c;
	}
	public void setC(Ponto2d c) {
		this.c = c;
	}

	public Ponto2d getD() {
		return d;
	}
	public void setD(Ponto2d d) {
		this.d = d;
	}
		
}

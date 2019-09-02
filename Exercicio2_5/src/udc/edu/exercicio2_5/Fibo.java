package udc.edu.exercicio2_5;

public class Fibo {
	
	private int n;
	
	public Fibo() {
	}
	public Fibo(int n) {
		super();
		this.n = n;
	}

	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}

	public long fibonacci(int n) {
		return (n < 2) ? n : fibonacci(n - 1) + fibonacci(n - 2);
	}





}

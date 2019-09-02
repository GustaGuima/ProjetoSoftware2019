package udc.edu.exercicio2_5;

public class Principal {
	
	public static void main(String[] args) {
		Fibo f = new Fibo(10);
				
		for(int i = 0; i < f.getN(); i++) {
			System.out.println(f.fibonacci(f.getN()));
		}
	}

}

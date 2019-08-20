package udc.edu.exercicio1_7;

public class Principal {

	public static void main(String[] args) {
		
		Contador eventos = new Contador();
		
		System.out.println(eventos.retornarValor());
		eventos.incrementarContador();
		System.out.println(eventos.retornarValor());
	
		
	}
	
}

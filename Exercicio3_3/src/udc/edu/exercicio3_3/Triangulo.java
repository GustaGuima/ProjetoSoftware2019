package udc.edu.exercicio3_3;

public class Triangulo {
	
	private int lado1;
	private int lado2;
	private int lado3;
	
	public Triangulo() {
		lado1 = 0;
		lado2 = 0;
		lado3 = 0;
	}
	public Triangulo(int lado1, int lado2, int lado3) {
		super();
		if(lado1 >= 0)
			this.lado1 = lado1;
		if(lado2 >= 0)
			this.lado2 = lado2;
		if(lado3 >= 0)
			this.lado3 = lado3;
	}
	
	public int getLado1() {
		return lado1;
	}
	public void setLado1(int lado1) {
		if(lado1 >= 0)
			this.lado1 = lado1;
	}
	
	public int getLado2() {
		return lado2;
	}
	public void setLado2(int lado2) {
		if(lado2 >= 0)
			this.lado2 = lado2;
	}
	
	public int getLado3() {
		return lado3;
	}
	public void setLado3(int lado3) {
		if(lado3 >= 0)
			this.lado3 = lado3;
	}
	
	public void classificarTriangulo() {
		
		if(lado1 == lado2 && lado2 == lado3 && lado3 == lado1) {
			System.out.println("Triangulo Equilatero");
		}
		
		if((lado1 == lado2 && lado2 != lado3) || (lado3 == lado1 && lado1 != lado2) || (lado3 == lado2 && lado2 != lado1)) {
			System.out.println("Triangulo Isoceles");
		}
		if(lado1 != lado2 && lado2 != lado3 && lado3 != lado1) {
			System.out.println("Triangulo Escaleno");
		}
		
	}

}

package udc.edu.exercicio72;

public class Principal {
	
	public static void main(String[] args) {
		
		Retangulo retangulo = new Retangulo(10,15);
		
		System.out.println(retangulo);
		
		float area = retangulo.calcularArea();
		float perimetro = retangulo.calcularPerimetro();
		
		System.out.println("Area do Retangulo: "+ area);
		System.out.println("Perimetro do Retangulo: "+perimetro);
		
		
	}

}

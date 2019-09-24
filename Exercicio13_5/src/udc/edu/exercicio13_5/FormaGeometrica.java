package udc.edu.exercicio13_5;

import udc.edu.exercicio13_5_1.Ponto2d;

public abstract class FormaGeometrica {
	public abstract Ponto2d centro();
	public abstract double perimetro();
	public abstract double area();
	public abstract double largura();
	public abstract double altura();
	
	public double distancia(FormaGeometrica forma) {
		return centro().distancia(forma.centro());
	}
	
	public String ObjectToString() {
		return super.toString();
	}
	

}

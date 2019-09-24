package udc.edu.exercicio13_5_1;

import udc.edu.exercicio13_5.FormaGeometrica;

public class Ponto2d extends FormaGeometrica{

	private double x;
	private double y;

	public double getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Ponto2d() {
		x = 0;
		y = 0;
	}

	public Ponto2d(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	public String quadrante(){
		if(x > 0 && y > 0) {
			return "1 Quadrante";
		}
		if(x < 0 && y > 0) {
			return "2 Quadrante";
		}
		if(x < 0 && y < 0) {
			return "3 Quadrante";
		}
		if(x > 0 && y < 0) {
			return "4 Quadrante";
		}
		return "Origem";
	}
	
	public double distancia(Ponto2d ponto) {
		return (double) Math.sqrt(x-ponto.x)*(x-ponto.x)+
				(y-ponto.y)*(y-ponto.y);
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ponto2d other = (Ponto2d) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}

	@Override
	public Ponto2d centro() {
		return new Ponto2d(x,y);
	}

	@Override
	public double perimetro() {
		return 0;
	}

	@Override
	public double area() {
		return 0;
	}

	@Override
	public double largura() {
		return 0;
	}

	@Override
	public double altura() {
		return 0;
	}

}

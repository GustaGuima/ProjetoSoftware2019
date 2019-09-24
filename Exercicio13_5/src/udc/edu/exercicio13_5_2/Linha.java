package udc.edu.exercicio13_5_2;

import udc.edu.exercicio13_5.FormaGeometrica;
import udc.edu.exercicio13_5_1.Ponto2d;

public class Linha extends FormaGeometrica{

	private Ponto2d x;
	private Ponto2d y;
	
	public Linha() {
		x = new Ponto2d(0,0);
		y = new Ponto2d(1,1);
	}
	
	public Linha(Ponto2d y) {
		x = new Ponto2d(0,0);
		y = new Ponto2d(y.getX(), y.getY());
	}

	public Linha(Ponto2d x, Ponto2d y) {
		super();
		this.x = new Ponto2d(x.getX(), x.getY());
		this.y = new Ponto2d(y.getX(), y.getY());
	}
	
	public Linha(double x1, double y1, double x2, double y2) {
		this.x = new Ponto2d(x1, y1);
		this.y = new Ponto2d(x2, y2);
	}
	
	//Getters and Setters
	public Ponto2d getX() {
		return x;
	}

	public void setX(Ponto2d x) {
		this.x = x;
	}

	public Ponto2d getY() {
		return y;
	}

	public void setY(Ponto2d y) {
		this.y = y;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Linha other = (Linha) obj;
		if (x == null) {
			if (other.x != null)
				return false;
		} else if (!x.equals(other.x))
			return false;
		if (y == null) {
			if (other.y != null)
				return false;
		} else if (!y.equals(other.y))
			return false;
		return true;
	}
	
	public double calcularAngulo() {
		return Math.atan((y.getY() - x.getY())/(y.getX() - x.getX()));
	}

	@Override
	public String toString() {
		return "Linha(" + x + "," + y + ")";
	}

	@Override
	public double perimetro() {
		return x.distancia(y);
	}

	@Override
	public double area() {
		return 0;
	}

	@Override
	public double largura() {
		return Math.abs(x.getX() - y.getX());
	}

	@Override
	public double altura() {
		return Math.abs(x.getY() - y.getY());
	}

	@Override
	public Ponto2d centro() {
		// TODO Auto-generated method stub
		return null;
	}

}

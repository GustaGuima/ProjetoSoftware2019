package udc.edu.exercicio13_5_2;

import udc.edu.exercicio13_5.FormaGeometrica;
import udc.edu.exercicio13_5_1.Ponto2d;

public class Linha extends FormaGeometrica{

	private Ponto2d x;
	private Ponto2d y;
	
	public Linha() {
		x = new Ponto2d();
		y = new Ponto2d();
	}

	public Linha(Ponto2d x, Ponto2d y) {
		super();
		x = new Ponto2d();
		this.x = new Ponto2d(x.getX(), x.getY());
		this.y = new Ponto2d(y.getX(), y.getY());
	}
	// Getters and Setters
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

package udc.edu.exercicio13_5_4;

import udc.edu.exercicio13_5.FormaGeometrica;
import udc.edu.exercicio13_5_1.Ponto2d;

public class Retangulo extends FormaGeometrica{

	private Ponto2d x;
	private Ponto2d y;
	
	public Retangulo(Ponto2d y) {
		this.x = new Ponto2d(0,0);
		this.y = new Ponto2d(y.getX(), y.getY());
	}
	
	public Retangulo(double x1, double y1, double x2, double y2) {
		this.x = new Ponto2d(x1, y1);
		this.x = new Ponto2d(x2, y2);
	}

	public Retangulo(Ponto2d x, Ponto2d y) {
		super();
		this.x = new Ponto2d(x.getX(), x.getY());
		this.y = new Ponto2d(y.getX(), y.getY());
	}
	
	public Retangulo() {
		this.x = new Ponto2d(0,0);
		this.y = new Ponto2d(1,1);
	}

	public Ponto2d getX() {
		return new Ponto2d(x.getX(), x.getY());
	}

	public void setX(Ponto2d x) {
		this.x = new Ponto2d(x.getX(), x.getY());
	}

	public Ponto2d getY() {
		return new Ponto2d(y.getX(), y.getY());
	}

	public void setY(Ponto2d y) {
		this.y = new Ponto2d(y.getX(), y.getY());
	}

	@Override
	public String toString() {
		return "Retangulo [x=" + x + ", y=" + y + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Retangulo other = (Retangulo) obj;
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
	public Ponto2d centro() {
		return new Ponto2d((x.getX() + y.getX())/2,
					       (x.getY() + y.getY())/2);
	}

	@Override
	public double perimetro() {
		return 2 * altura() + 2 * largura();
	}

	@Override
	public double area() {
		return altura() * largura();
	}

	@Override
	public double largura() {
		return Math.abs(x.getX() - y.getX());
	}

	@Override
	public double altura() {
		return Math.abs(x.getY() - y.getY());
	}
	
	
	
	

}

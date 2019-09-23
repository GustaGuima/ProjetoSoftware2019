package udc.edu.exercicios7_1_1;

public class Ponto2d {

	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Ponto2d() {
	}

	public Ponto2d(int x, int y) {
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
	
	public float distancia(Ponto2d ponto) {
		return (float) Math.sqrt(x-ponto.x)*(x-ponto.x)+
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

}

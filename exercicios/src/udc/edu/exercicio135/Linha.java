package udc.edu.exercicio135;

public class Linha {
	
	private Ponto2d x;
	private Ponto2d y;
	
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



	public Linha() {
	}
	
	public Linha(Ponto2d x, Ponto2d y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Linha("+ x +","+ y +")";
	}
	
	

}

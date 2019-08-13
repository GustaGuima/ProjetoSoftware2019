package udc.edu.exercicio72;

public class Retangulo {
	
	private float comprimento = 1;
	private float largura = 1;
	
	
	
	public Retangulo() {
	
	}
	public Retangulo(float comprimento, float largura) {
		super();
		
		if(comprimento > 0.0 && comprimento < 20.0) 
			this.comprimento = comprimento;
		else
			return;
		
		if(largura > 0.0 && largura < 20.0) 
			this.largura = largura;
		else
			return;
	}
	
	//Getters and Setters
	public float getComprimento() {
		return comprimento;
	}
	public void setComprimento(float comprimento) {
		if(comprimento > 0.0 && comprimento < 20.0) {
			this.comprimento = comprimento;
		}
		return;
	}
	
	public float getLargura() {
		return largura;
	}
	public void setLargura(float largura) {
		if(largura > 0.0 && largura < 20.0) {
			this.largura = largura;
		}
		return;
	}
	
	public float calcularPerimetro() {
		float perimetro;
		perimetro = (comprimento + largura)*2;
		return perimetro;
	}
	
	public float calcularArea() {
		float area;
		area = comprimento * largura;
		return area;
	}
	
	@Override
	public String toString() {
		return "Retangulo [comprimento=" + comprimento + ", largura=" + largura + "]";
	}

	
	

}

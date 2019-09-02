package udc.edu.exercicio2_2;

public class Numbers {
	
	private int primeiro;
	private int segundo;
	
	public Numbers() {
	}
	public Numbers(int primeiro, int segundo) {
		super();
		this.primeiro = primeiro;
		this.segundo = segundo;
	}
	public int getPrimeiro() {
		return primeiro;
	}
	public void setPrimeiro(int primeiro) {
		this.primeiro = primeiro;
	}
	
	public int getSegundo() {
		return segundo;
	}
	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}

	public int soma() {
		return primeiro + segundo;
	}
	
	public int soma(int primeiro, int segundo) {
		return primeiro + segundo;
	}
	
	public int diferenca() {
		return primeiro - segundo;
	}
	
	public int diferenca(int primeiro, int segundo) {
		return primeiro - segundo;
	}
}

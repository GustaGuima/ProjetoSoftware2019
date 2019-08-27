package udc.edu.exercicio1_19;

public class Movimentacao {
	
	private String descricao;
	private float valor;
	private boolean tipo;
	
	//Constructors
	public Movimentacao() {
	}
	public Movimentacao(String descricao, float valor, boolean tipo) {
		super();
		this.descricao = descricao;
		this.valor = valor;
		this.tipo = tipo;
	}


	//Getters and Setters
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public boolean isTipo() {
		return tipo;
	}
	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Movimentacao [descricao=" + descricao + ", valor=" + valor + ", tipo=" + tipo + "]";
	}
	
	
	
	
	
	

}

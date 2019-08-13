package udc.edu.exercicio135;

public class Retangulo {

	private Linha linha;

	public Linha getLinha() {
		return linha;
	}

	public void setLinha(Linha linha) {
		this.linha = linha;
	}

	public Retangulo() {
	}

	public Retangulo(Linha linha) {
		super();
		this.linha = linha;
	}

	@Override
	public String toString() {
		return "Retangulo(" + linha + ")";
	}

}
